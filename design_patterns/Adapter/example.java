// 継承
public class Taro {
    public void enjoyWithAllClassmate() {

    }
}

public class NewTaro extends Taro implements ChairPerson {
    public void organizeClass() {
        enjoyWithAllClassmate();
    }
}

public interface ChairPerson {
    public void organizeClass();
}

public class Teacher {
    public static void main(String args[]) {
        ChairPerson chairperson = new NewTaro();
        chairperson.organizeClass();
    }
}

// 移譲
public class Hanako implements ChairPerson{
    private Taro taro;
    public Hanako() {
        taro = new Taro();
    }

    public void organizeClass() {
        taro.enjoyWithAllClassmate();
    }
}