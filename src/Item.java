public enum Item {

    //Melee Weapons
    POLEARM(0, 0, 1, "A stick with a knife on the end.", "Polearm"),
    HAMMER(1, 0, 1, "A Wooden Hammer.", "Hammer"),
    SWORD(2, 0, 1, "A Rusty Sword.", "Sword"),
    AXE(3, 0, 1, "A Sturdy Lumber Axe.", "Axe"),
    FLAIL(4, 0, 1, "A Flail....", "Flail"),

    //Ranged Weapons
    JAVELIN(0, 1, 1, "A Throwing Spear", "Javelin"),
    CROSSBOW(1, 1, 1, "A Durable Crossbow", "Crossbow"),
    THROWINGCHAINSAW(2, 1, 1, "Yes, A Throwing Chainsaw", "Throwing Chainsaw"),
    SNIPER(3, 1, 1, "BOOM, Headshot", "Sniper"),
    NUKE(4, 1, 1, "GG", "Nuke"),

    //Potions
    SMALLPOTION(0, 2, 15, 0, "Potion that heals 20% Health", "Small Potion"),
    MEDIUMPOTION(1, 3, 10, 0, "Potion that heals 50% Health", "Medium Potion"),
    LARGEPOTION(2, 4, 5, 0, "Potion that heals 80% Health", "Large Potion");

    private int tier;
    private int slot;
    private int stackSize;
    private int currentStack;
    private String desc;
    private String name;

    Item(int tier, int slot, int stackSize, String desc, String name){
        this.setTier(tier);
        this.setSlot(slot);
        this.setStackSize(stackSize);
        this.setDesc(desc);
        this.setName(name);
    }

    Item(int tier, int slot, int stackSize, int currentStack, String desc, String name){
        this.setTier(tier);
        this.setSlot(slot);
        this.setStackSize(stackSize);
        this.setCurrentStack(currentStack);
        this.setDesc(desc);
        this.setName(name);
    }

    public void setTier(int tier)
    {
        this.tier = tier;
    }

    public int getTier()
    {
        return this.tier;
    }

    public void setSlot(int slot)
    {
        this.slot = slot;
    }

    public int getSlot()
    {
        return this.slot;
    }

    public void setStackSize(int stackSize)
    {
        this.stackSize = stackSize;
    }

    public int getStackSize()
    {
        return this.stackSize;
    }

    public void setCurrentStack(int currentStack)
    {
        this.currentStack = currentStack;
    }

    public int getCurrentStack()
    {
        return this.currentStack;
    }

    public void setDesc(String desc){
        this.desc = desc;
    }

    public String getDesc(){
        return desc;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
