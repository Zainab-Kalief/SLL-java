class MySLL {
  public Node head;
  public MySLL() {
    this.head = null;
  }
  public MySLL add(String value) {
    Node newNode = new Node(value);
    if(this.head == null) {
      this.head = newNode;
    } else {
      Node runner = this.head;
      while(runner.next != null) {
        runner = runner.next;
      }
      runner.next = newNode;
    }
    return this;
  }

  public MySLL remove() {
    Node current = this.head;
    Node previous = this.head;
    while(current.next != null) {
      previous = current;
      current = current.next;
    }
    previous.next = null;
    return this;
  }

  public MySLL remove(int num) {
    Node current = this.head;
    Node previous = this.head;
    int count = 1;
    if(count == num) {
      this.head = null;
      return this;
    }
    while(current.next != null) {
      count += 1;
      previous = current;
      current = current.next;
      if(count == num) {
        previous.next = current.next;
        return this;
      }
    }
    count += 1;
    if(count == num) {
      previous.next = null;
    }
    return this;
  }
}
