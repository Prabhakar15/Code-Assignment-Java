package com.sg.singtel.rest.behaviour;

import com.sg.singtel.rest.helper.SingHelper;
import com.sg.singtel.rest.utils.enmus.SoundEnums;

public class Dog extends Mammal {
    public Dog() {
        super((new SingHelper(SoundEnums.DOG)));
    }

    public Dog(SingHelper singHelper) {
        super(singHelper);
    }
}
