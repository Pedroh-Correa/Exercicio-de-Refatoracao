package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {


    @Test
    void agedBrie_QualityIncreases_AsItGetsOlder() {
        Item agedBrie = new Item("Aged Brie", 10, 20, false);
        Item meat = new Item("Meat", 8, 15, false);
        Item[] items = new Item[] { agedBrie };
        GildedRose app = new GildedRose(items);

        for(Item item : items) {
            item.updateQuality();
        }


        assertEquals(9, app.items[0].getSellIn());
        assertEquals(21, app.items[0].getQuality());
    }

    @Test
    void itemQuality_NeverExceeds_50() {
        Item agedBrie = new Item("Aged Brie", 10, 50, false);
        Item[] items = new Item[] { agedBrie };
        GildedRose app = new GildedRose(items);

        for(Item item : items) {
            item.updateQuality();
        }

        assertEquals(50, app.items[0].getQuality());
    }


    @Test
    void sulfuras_BeingLegendary_NeverChanges() {
        Item sulfuras = new Item("Sulfuras, Hand of Ragnaros", 10, 80, false);
        Item[] items = new Item[] { sulfuras };
        GildedRose app = new GildedRose(items);

        for(Item item : items) {
            item.updateQuality();
        }

        assertEquals(10, app.items[0].getSellIn());
        assertEquals(80, app.items[0].getQuality());
    }

}
