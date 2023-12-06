package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import static org.example.QuestType.Type.YOYEYO;

@Component@QuestType(YOYEYO)
public class SingYoYoeQuest implements Quest{
    public String goQuest() {
        return "Knight sing 'YoYeYo' happily...";
    }
}
