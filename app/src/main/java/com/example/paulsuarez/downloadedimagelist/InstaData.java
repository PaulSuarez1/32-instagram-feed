package com.example.paulsuarez.downloadedimagelist;

import java.util.ArrayList;
import java.util.List;

public class InstaData {

    public static final List<InstaPost> hearthstoneCards = new ArrayList<>();
    static {

        hearthstoneCards.add(new InstaPost("Golemagg", "50 mana 20 attack 20 health. Costs (1) less for each damage your hero has taken.", "https://media-hearth.cursecdn.com/avatars/372/891/636627613047130898.png"));
        hearthstoneCards.add(new InstaPost("C'Thun", "10 mana 6 attack 6 health. Deal damage equal to this minion's Attack randomly split among all enemies.", "https://d1u5p3l4wpay3k.cloudfront.net/hearthstone_gamepedia/d/d0/C%27Thun%2831110%29_Gold.png?version=2e429207d17f92bf68c65fbf0e951114"));
        hearthstoneCards.add(new InstaPost("Deathwing, Dragonlord", "10 mana 12 attack 12 health. Put all Dragons from your hand into the battlefield.", "https://media-hearth.cursecdn.com/avatars/333/995/33177.png"));

    }
}
