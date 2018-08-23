package com.example.paulsuarez.downloadedimagelist;

import java.util.ArrayList;
import java.util.List;

public class InstaData {

    public static final List<InstaPost> hearthstoneCards = new ArrayList<>();
    static {

        hearthstoneCards.add(new InstaPost("Golemagg", "50 mana 20 attack 20 health. Costs (1) less for each damage your hero has taken.", ""));
        hearthstoneCards.add(new InstaPost("C'Thun", "10 mana 6 attack 6 health. Deal damage equal to this minion's Attack randomly split among all enemies.", ""));
        hearthstoneCards.add(new InstaPost("Deathwing, Dragonlord", "10 mana 12 attack 12 health. Put all Dragons from your hand into the battlefield.", ""));

    }
}
