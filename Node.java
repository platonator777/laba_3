package ru.kapustin.structures;

public class Node {
    private Integer value;
    private Node parent;
    private Node left;
    private Node right;

    public Node() {}

    public void addValue(int newValue) {
        if (value == null) {
            value = newValue;
        } else if (newValue <= value) {
            if (left == null) {
                left = new Node();
                left.parent = this;
            }
            left.addValue(newValue);
        } else {
            if (right == null) {
                right = new Node();
                right.parent = this;
            }
            right.addValue(newValue);
        }
    }

    public boolean deleteValue(int valueToDelete) {
        if (value == null) return false;

        if (valueToDelete == value) {
            if (left != null) left.parent = parent;
            if (right != null) right.parent = parent;
            if (parent != null) {
                if (parent.left == this) parent.left = (left != null) ? left : right;
                else parent.right = (left != null) ? left : right;
            }
            value = null;
            return true;
        } else if (valueToDelete < value && left != null) {
            return left.deleteValue(valueToDelete);
        } else if (valueToDelete > value && right != null) {
            return right.deleteValue(valueToDelete);
        }
        return false;
    }


    public boolean containsValue(int searchValue) {
        if (value == null) return false;
        if (searchValue == value) return true;
        if (searchValue < value && left != null) return left.containsValue(searchValue);
        if (searchValue > value && right != null) return right.containsValue(searchValue);
        return false;
    }


    public String toString() {
        StringBuilder result = new StringBuilder();
        if (left != null) result.append(left.toString()).append(" ");
        if (value != null) result.append(value).append(" ");
        if (right != null) result.append(right.toString()).append(" ");
        return result.toString().trim();
    }
}
