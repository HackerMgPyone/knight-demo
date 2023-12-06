package org.example;

import org.springframework.stereotype.Component;

import static org.example.QuestType.Type.DRAGON;


@Component
@QuestType(DRAGON)
public class KillDragonQuest implements Quest {
    public String goQuest() {
        return "Knight killed the dragon.";
    }
}
