package Exercise2;

public enum Animals {
    CAT(7),
    DOG(3),
    PIG(1);
    private int age;


    Animals(int agePar){this.age=agePar;}

    @Override
    public String toString() {return super.toString()+", вік "+age;
    }

}

class Main{
    public static void main(String[] args) {
        System.out.println(Animals.CAT);
        System.out.println(Animals.DOG);
        System.out.println(Animals.PIG);
    }
}
/* Створіть проект за допомогою IntelliJ IDEA.
Створіть перерахунковий тип (enum) Animals,
 що містить конструктор, який повинен набувати цілого числа (вік тварини),
 і містити перевантажений метод toString(),
 який повинен повертати назву екземпляра та вік тварини.
 */