package com.ameya.recyclerlist.model;

import com.ameya.recyclerlist.R;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by 0411a on 3/31/2017.
 */

public class DummyData {
    private static final String[] titles = {
            "Hello from Adele",
                    "You cant see me!",
            "Wrestlemania 33 - the ultimate thrill ride",
                    "Lately, I've been, I've been losing sleep..." +
                    "Dreaming about the things that we could be",
            "But baby, I've been, I've been praying hard" +
            "Said no more counting dollars" +
            "We'll be counting stars" +
            "Yeah we'll be counting stars",
                    "Old, but I'm not that old" +
                    "Young, but I'm not that bold" +
                    "And I don't think the world is sold" +
                    "On just doing what we're told",
            "I-I-I-I feel something so right" +
            "Doing the wrong thing" +
            "I-I-I-I feel something so wrong" +
            "Doing the right thing" +
            "I couldn't lie, couldn't lie, couldn't lie" +
            "Everything that kills me makes me feel alive",
                    "I feel the love and I feel it burn" +
                    "Down this river, every turn" +
                    "Hope is our four-letter word" +
                    "Make that money, watch it burn",
            "Damn is it even working"
    };


    private static final int[] icons = {android.R.drawable.ic_popup_disk_full,
                                        android.R.drawable.ic_menu_add,
                                        android.R.drawable.ic_menu_delete};

    private static final String[] subTitles = {"Ameya", "Vivek", "Tapas", "Patil",
                                                "Manali", "Chintu", "Sanika", "Sammy", "Jose", "Seema", "Priyam"};

    private static int icon = R.drawable.ic_face_black_36dp;

    public static List<ListItem> getListData() {
        List<ListItem> data = new ArrayList<>();
        for (int x = 0; x < 8; x++) {
            for (int i = 0; i < titles.length; i++) {
                ListItem item = new ListItem();
                //item.setImageResID(icons[i]);
                item.setTitle(titles[i]);
                item.setSubTitle(subTitles[i]);
                data.add(item);
            }
        }
        return data;

    }

    public static ListItem getRandomListItem(){
        int rand1 = new Random().nextInt(7);
        int rand2 = new Random().nextInt(10);

        ListItem item = new ListItem();

        item.setTitle(titles[rand1]);
        item.setSubTitle(subTitles[rand2]);

        return item;
    }

}
