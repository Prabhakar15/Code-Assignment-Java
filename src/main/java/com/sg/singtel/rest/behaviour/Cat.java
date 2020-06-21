package com.sg.singtel.rest.behaviour;

import com.sg.singtel.rest.helper.SingHelper;
import com.sg.singtel.rest.utils.enmus.SoundEnums;

public class Cat extends Mammal {
    public Cat() {
        super(new SingHelper(SoundEnums.CAT));
    }

    public Cat(SingHelper singHelper) {
        super(singHelper);
    }
}
