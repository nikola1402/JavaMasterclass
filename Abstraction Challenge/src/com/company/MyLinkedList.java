package com.company;

/**
 * Created by nikol on 15-Jan-18.
 */
public class MyLinkedList implements NodeList {

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if(this.root == null) {
            // The list was empty. This item becomes the head
            this.root = item;
            return true;
        }

        ListItem currentItem = this.root;
        while(currentItem != null){
            int comparison = (currentItem.compareTo(item));
            if (comparison < 0){
                // New item is greater, move right
                if(currentItem.next() != null){
                    currentItem = currentItem.next();
                } else {
                    // There is no next, insert at the end
                    currentItem.setNext(item).setPrevious(currentItem);
                    return true;
                }
            } else if(comparison > 0){
                // New item is smaller, move left
                if (currentItem.previous() != null){
                    currentItem.previous().setNext(item).setPrevious(currentItem.previous());
                    item.setNext(currentItem).setPrevious(item);
                } else {
                    // there is no previous, insert at the beginning
                    item.setNext(this.root).setPrevious(item);
                    this.root = item;
                }
                return true;
            } else {
                System.out.println(item.getValue() + " is already present. Not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null){
            System.out.println("Deleting item "+item.getValue());
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if(comparison == 0){
                // Found the item to delete
                if(currentItem == this.root){
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem.next() != null){
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if(comparison < 0) {
                currentItem = currentItem.next();
            } else {
                // Comparison > 0; We are at an item greater than the one to be deleted. Item not in the list
                return false;
            }
        }

        // Without finding the item to delete
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root == null){
            System.out.println("The list is empty");
        } else {
            while(root != null){
                System.out.println(root.getValue());
                root = root.next();
            }
        }

    }
}
