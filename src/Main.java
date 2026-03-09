public class Main {

    public static void main(String[] args) {
        System.out.println("Поехали!");
        Actor actor1 = new Actor("Васян", "Нетбальский", Gender.MALE, 165);
        Actor actor2 = new Actor("Иван", "Васильев", Gender.MALE, 175);
        Actor actor3 = new Actor("Павел", "Шейнев", Gender.MALE, 180);
        Actor actor4 = new Actor("Васянчикс", "Нетбальский", Gender.MALE, 165);
        Actor actor5 = new Actor("Анжела", "Петрова", Gender.FEMALE, 165);

        Director director1 = new Director("Сергей", "Васянкин", Gender.MALE);
        Director director2 = new Director("Ольга", "Ромашкина", Gender.FEMALE);

        MusicAuthor musicAuthor = new MusicAuthor("Виталий", "Гостюхин", Gender.MALE);
        Choreographer choreographer = new Choreographer("Антон", "Серебряков", Gender.MALE);

        Show romeoAndJuliet = new Show("Ромео и Джульетта", 120, director1);
        Ballet zolushka = new Ballet("Золушка", 120, director2, musicAuthor, "1 2 3 либретто тест",
                choreographer);
        Opera knazIgor = new Opera("Князь Игорь", 60, director1, "начинают петь. продолжают петь" +
                " и заканчивают петь", musicAuthor, 3);

        romeoAndJuliet.addNewActor(actor1);
        romeoAndJuliet.addNewActor(actor5);
        zolushka.addNewActor(actor2);
        zolushka.addNewActor(actor1);
        knazIgor.addNewActor(actor1);
        knazIgor.addNewActor(actor3);
        knazIgor.addNewActor(actor5);

        System.out.println("Список актеров Ромео и джульета:");
        romeoAndJuliet.printAllOfActors();
        System.out.println("____________");
        System.out.println("Список актеров Золушка:");
        zolushka.printAllOfActors();
        System.out.println("____________");
        System.out.println("Список актеров Князь Игорь:");
        knazIgor.printAllOfActors();
        System.out.println("____________");
        knazIgor.changeActor(actor5, actor2);
        romeoAndJuliet.changeActor(actor2, actor3);
        System.out.println("__Либретто Золушки__");
        zolushka.printLibrettoText();
        System.out.println("__Либретто Князя Игоря__");
        knazIgor.printLibrettoText();
    }
}
