import java.util.ArrayList;

public class Theatre {

    public static void main(String[] args) {
        System.out.println("Добавляем актёров");
        Actor actor1 = new Actor("Киану", "Ривз", Gender.MALE, 186);
        Actor actor2 = new Actor("Аня", "Тейлор-Джой", Gender.FEMALE, 173);
        Actor actor3 = new Actor("Юра", "Борисов", Gender.MALE, 177);
        //Немного патриотизма в эту театральную солянку

        Director director1 = new Director("Гай", "Ричи", Gender.MALE, 12);
        Director director2 = new Director("Квентин", "Тарантино", Gender.MALE, 19);

        Person musicAuthor1 = new Person("Кэнсукэ", "Усио", Gender.MALE);

        Person choreographer1 = new Person("Райан", "Гослинг", Gender.MALE);

        System.out.println("Создаём спектакли");
        Show drama1 = new Show(
                "Бедная собачка",
                180,
                director1.toString(),
                new ArrayList<>()
        );

        MusicalShow opera1 = new MusicalShow(
                "Дружба народов",
                190,
                director2.toString(),
                new ArrayList<>(),
                musicAuthor1.toString(),
                "Очень объёмный текст"
        );

        Ballet ballet1 = new Ballet(
                "Двое мужчин очень долго танцуют",
                890,
                director1.toString(),
                new ArrayList<>(),
                musicAuthor1.toString(),
                "Менее объёмный текст",
                choreographer1.toString()
        );

        System.out.println("Добавляем актёров в спектакли");
        drama1.addActor(actor1);
        drama1.addActor(actor2);

        opera1.addActor(actor2);
        opera1.addActor(actor3);

        ballet1.addActor(actor1);
        ballet1.addActor(actor3);

        System.out.println("Выводим список актёров");
        drama1.printActors();
        opera1.printActors();
        ballet1.printActors();

        System.out.println("Заменяем актёров");
        opera1.changeActor(actor1, "Борисов");
        System.out.println("Снова выводим список актёров");
        opera1.printActors();

        System.out.println("Заменяем несуществующего актёра");
        opera1.changeActor(actor3, "Смит");

        System.out.println("Выводим текст либретто");
        opera1.printLibrettoText();
        ballet1.printLibrettoText();
    }
}
