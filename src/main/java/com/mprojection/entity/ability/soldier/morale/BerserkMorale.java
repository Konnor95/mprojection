package com.mprojection.entity.ability.soldier.morale;

import com.mprojection.entity.FullUserInfo;
import com.mprojection.entity.ability.Ability;
import com.mprojection.util.Translator;

import java.util.List;

public class BerserkMorale extends Ability {

    private static final float ATTACK_FACTOR = 3f;

    public BerserkMorale() {
        super("ability.soldier.morale.berserk.name", "ability.soldier.morale.berserk.description", 300, false);
    }

    @Override
    public List<Ability> getNext() {
        return null;
    }

    @Override
    public void apply(FullUserInfo user, Translator translator) {
        super.apply(user, translator);
        user.setAbilityAttackFactor(ATTACK_FACTOR);
    }
}
