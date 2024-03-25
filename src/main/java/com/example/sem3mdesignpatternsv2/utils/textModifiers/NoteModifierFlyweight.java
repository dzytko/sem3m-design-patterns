package com.example.sem3mdesignpatternsv2.utils.textModifiers;

import java.util.HashMap;

public class NoteModifierFlyweight {
    private static NoteModifierFlyweight instance = null;
    private static final HashMap<String, String> lowerModifierCache = new HashMap<>();
    private static final HashMap<String, String> upperModifierCache = new HashMap<>();
    private static final HashMap<String, String> reverseModifierCache = new HashMap<>();

    private NoteModifierFlyweight() {
    }

    public static NoteModifierFlyweight getInstance() {
        if (instance == null) {
            instance = new NoteModifierFlyweight();
        }
        return instance;
    }

    public Boolean contains(String text, TextModifier modifier) {
        if (modifier instanceof LowerModifier) {
            return lowerModifierCache.containsKey(text);
        } else if (modifier instanceof UpperModifier) {
            return upperModifierCache.containsKey(text);
        } else if (modifier instanceof ReverseAdapter) {
            return reverseModifierCache.containsKey(text);
        }
        return false;
    }

    public String get(String text, TextModifier modifier) {
        if (modifier instanceof LowerModifier) {
            return lowerModifierCache.get(text);
        } else if (modifier instanceof UpperModifier) {
            return upperModifierCache.get(text);
        } else if (modifier instanceof ReverseAdapter) {
            return reverseModifierCache.get(text);
        }
        return null;
    }

    public void put(String text, String modifiedText, TextModifier modifier) {
        if (modifier instanceof LowerModifier) {
            lowerModifierCache.put(text, modifiedText);
        } else if (modifier instanceof UpperModifier) {
            upperModifierCache.put(text, modifiedText);
        } else if (modifier instanceof ReverseAdapter) {
            reverseModifierCache.put(text, modifiedText);
        }
    }


}
