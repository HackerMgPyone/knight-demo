package org.example;

import org.springframework.stereotype.Component;


import static org.example.QuestType.Type.PRINCESS;


@Component @QuestType(PRINCESS)
public class RescuingThePrincessQuest implements Quest{

    public String goQuest() {
        return "Knight is going to rescue the princess.";
    }
}
