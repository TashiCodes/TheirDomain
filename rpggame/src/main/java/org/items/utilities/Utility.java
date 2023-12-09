package org.items.utilities;

import org.items.Item;

public abstract class Utility extends Item {
    public Utility(String name, String description, int weight) {
        super(name, description, weight);
    }

    public abstract void use();
}
