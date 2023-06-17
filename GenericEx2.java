class GenericsClass <T extends Number> {

  public void display() {

    System.out.println("This is a bounded type generics class.");

  }

}

class GenericEx2
{

  public static void main(String[] args) {


    GenericsClass<String> obj = new GenericsClass<>();

  }

}
