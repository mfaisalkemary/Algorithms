public class Human {
    String Name;
    int Age;
    int Height;
    String EyeColor;

    public Human(String name, int age, int height, String eyeColor) {
        Name = name;
        Age = age;
        Height = height;
        EyeColor = eyeColor;
    }

    public void Speak(){
        System.out.println("My Name is "+Name);
        System.out.println("My Age is "+Age);
        System.out.println("My Height is "+Height);
        System.out.println("My Eye color is "+EyeColor);
    }
}
