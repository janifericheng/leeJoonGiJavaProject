public class IMDBApp {
    public static void main(String[] args) {
        String actorName = "Lee Joon-Gi";
        int actorDOB = 1982;
        int age = 2021 - actorDOB;

        String[] filmography =
                {"Flower of Evil", "Lawless Lawyer", "Criminal Minds", "Resident Evil: The Final Chapter", "Moon Lovers: Scarlet Heart Ryeo"};
        float[] filmRatings = {8.7F, 7.4F, 5.7F, 5.5F, 8.7F};

        System.out.println("Actor's Name: " + actorName);
        System.out.println("Born: " + actorDOB + " (" + age + " years old)");

        System.out.println("Filmography:");

        for (int i = 0; 1 < filmography.length; i++) {
            System.out.println(filmography[i] + " - " + getRating(filmRatings[i]));
        }
   }

        static String getRating(float rating){
            if (rating <= 5.0){
                return "bad";
            } else if (rating > 5.0 && rating <= 6.5) {
                return "average";
            } else if (rating > 6.5 && rating <= 7.0) {
                return "good";
            } else if (rating > 7.0 && rating <= 8.5) {
                return "very good";
            } else {
                return "amazing";
            }
        }
   }

