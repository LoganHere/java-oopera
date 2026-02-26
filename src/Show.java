import java.util.ArrayList;
import java.util.Scanner;

public class Show {
    private String title;
    private int duration;
    private String director;
    private ArrayList<Actor> listOfActors;

    public Show(String title, int duration, String director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printActors() {
        System.out.println("Актёры в спектакле:");
        if (listOfActors == null || listOfActors.isEmpty()) {
            System.out.println("Список пуст");
            return;
        }

        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);
            System.out.println((i+1) + ". " + actor);
        }
    }

    private boolean isActorsExist(Actor newActor) {
        for (Actor existingActor : listOfActors) {
            if (existingActor.equals(newActor)) {
                return true;
            }
        }
        return false;
    }

    public void addActor(Actor newActor) {
        if (isActorsExist(newActor)) {
            System.out.println("Актёр " + newActor + " уже есть в спектакле.");
        } else {
            listOfActors.add(newActor);
            System.out.println("Актёр " + newActor + " успешно добавлен в спектакль.");
        }
    }

//    Я решил добавить обработку на тот случай, если существуют актёры с одинаковой фамилией, из-за этого метод
//    стал слишком объёмным. Если решите, что его стоит разбить - придётся выкручиваться. Дайте подсказку, что стоит
//    перенести в отдельный метод.

//    Я дошёл до заданий в Main и понял, что дорабатывать метод не имело смысла, ибо мы не делаем меню.
//    Без внятного ТЗ результат ХЗ

    public void changeActor(Actor newActor, String surnameToReplace) {
        ArrayList<Integer> matchingIndex = new ArrayList<>();

        for (int i = 0; i < listOfActors.size(); i++) {
            Actor currentActor = listOfActors.get(i);
            if(currentActor.getSurname().equalsIgnoreCase(surnameToReplace)) {
                matchingIndex.add(i);
            }
        }

        if (matchingIndex.isEmpty()) {
            System.out.println("Актёр с фамилией " + surnameToReplace + " не найден в спектакле.");
        } else if (matchingIndex.size() == 1){
            int index = matchingIndex.get(0);
            Actor oldActor = listOfActors.get(index);
            listOfActors.set(index, newActor);
            System.out.println("Актёр " + oldActor + " заменён на " + newActor);
        } else {
            System.out.println("Найдено несколько актёров");
            for (int i = 0; i < matchingIndex.size(); i++) {
                Actor actor = listOfActors.get(matchingIndex.get(i));
                System.out.println((i+1) + ". " + actor);
            }
            Scanner scanner = new Scanner(System.in);
            System.out.println("Выберите номер: ");
            int choice = scanner.nextInt();

            if(choice >= 1 && choice <= matchingIndex.size()) {
                int index = matchingIndex.get(choice - 1);
                Actor oldActor = listOfActors.get(index);
                listOfActors.set(index, newActor);
                System.out.println("Заменён: " + oldActor.getName() + " " + oldActor.getSurname());
            }
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public ArrayList<Actor> getListOfActors() {
        return listOfActors;
    }

    public void setListOfActors(ArrayList<Actor> listOfActors) {
        this.listOfActors = listOfActors;
    }
}
