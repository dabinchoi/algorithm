package javaexam;

public class Box {
    private Item item;

    public void add(Item item){
        this.item = item;
        int tmp = this.item.x;
        this.item.x = this.item.y;
        this.item.y = tmp;
    }
    public Item get(){
        return item;
    }
}
