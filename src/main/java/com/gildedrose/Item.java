package com.gildedrose;

public class Item {

    private String name;

    private int sellIn;

    private int quality;

    private boolean conjured;

    public Item(String name, int sellIn, int quality,  boolean conjured) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        this.conjured = conjured;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    public String getName() {
        return name;
    }
    public int getSellIn() {
        return sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void updateQuality() {
        if(this.sellIn == 0 && this.quality >=2) {
            this.quality = this.quality - 2;
        }else if(this.name.equals("Aged Brie")) {
            this.quality++;
        }else if (this.name.equals("Sulfuras, Hand of Ragnaros")) {
            return;
        }else if(this.name.equals("Backstage passes")) {
            if(this.sellIn <= 10 && this.sellIn > 5) {
                this.quality++;
                this.quality ++;
            }else if(this.sellIn <= 5 && this.sellIn > 0) {
                this.quality++;
                this.quality ++;
                this.quality ++;
            }else if(this.sellIn == 0) {
                this.quality = 0;
            }
        }
        else{// caso padrao onde so decresce o tempo de validade e a qualidade
            this.quality --;
            this.sellIn --;
        }

        this.sellIn --;

        if(this.quality < 0) {
            this.quality = 0;
        }
        if(this.quality >50) {
            this.quality = 50;
        }
    }

    @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}

