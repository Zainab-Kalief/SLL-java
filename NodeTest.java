class NodeTest {
  public static void main(String[] args) {
    MySLL sll1 = new MySLL();
    sll1.add("Sade").add("Bimbo").add("Tosan").remove(3);
    Node runner = sll1.head;
    while(runner.next != null) {
      System.out.println(runner.value);
      runner = runner.next;
    }
    System.out.println(runner.value);
  }
}
