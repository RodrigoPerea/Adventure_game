package com.company;


public class Item {
  private String name;
  private String itemDescription;


  public Item(String name, String desccreption) {
    this.name = name;
    this.itemDescription = desccreption;
  }

  public void setName(String name) {
    this.name = name;
  }



  public String getName() {
    return name;
  }

  public void setItemDescription(String itemDescription) {
    this.itemDescription = itemDescription;
  }

  public String getItemDescription() {
    return itemDescription;
  }


  public String look() {
    return getItemDescription();
  }
public String toString(){
    return name + " " + itemDescription;
}



}





















/*


  if (choice.equals("take axe")) {
    System.out.println("You pick up the axe");
    inv.add("axe");

    System.out.println("You walk for awhile and start to become thirsty");
    System.out.println(inv);
    choice = scan.nextLine();

    if (choice.equals("drink")) {
      if (inv.contains("pepsi")) {
        System.out.println("You drink a can of pepsi");
        inv.remove("pepsi");

        if (inv.contains("pepsi")) {
          System.out.println("You drank pepsi");
          inv.remove("pepsi");
        } else if (!inv.contains("pepsi")) {
          System.out.println("You have nothing to drink!");
        }
      }

 */


