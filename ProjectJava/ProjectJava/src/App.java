import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import java.util.Scanner;

import entities.Cours;
import entities.Module;
import services.CoursService;
import services.ModuleService;
import java.time.LocalDate;
import java.time.LocalTime;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        ModuleService moduleService=new ModuleService();
        CoursService coursService=new CoursService();
        int choix;
        do {
            System.out.println("1- Ajouter un module");
            System.out.println("2- Lister les modules");
            System.out.println("3- Creer un cours");
            System.out.println("4- Lister tous les cours");
            System.out.println("5- Lister les cours d'un module et d'un professeur");
            System.out.println("6- Quitter");
            System.out.println("Faites un choix");
            choix=sc.nextInt();
            sc.nextLine();
            switch (choix) {
                case 1:
                    System.out.println("Entrer le nom de module");
                    String nomModule=sc.nextLine();
                    Module mo=new Module();
                    mo.setNomModule(nomModule);
                    moduleService.ajouterUnModule(mo);

                    break;
                case 2:
                List<Module> modules=moduleService.listerModule();
                    for (Module module: modules) {
                        System.out.println("Nom "+ module.getNomModule());
                        System.out.println("=================================");
                    }
                break;
                case 3:
                
                    System.out.println("Entrer la date du cours");
                    LocalDate date=LocalDate.parse(sc.nextLine());
                    System.out.println("Entrer l'heure du cours");
                    LocalTime heure=LocalTime.parse(sc.nextLine());
                    Cours co=new Cours(date, heure);
                    coursService.ajouterUnCours(co);
                break;

                case 4:
                List<Cours> cours=coursService.listerCours();
                    for (Cours cour: cours) {
                        System.out.println("Date "+ cour.getDateCours());
                        System.out.println("Heure "+ cour.getHeureCours());
                        System.out.println("=================================");
                    }
                break;
                case 5:
                System.out.println("Entrer le nom du module");
                String nomModules=sc.nextLine();
                System.out.println("Entrer le nom du professeur");
                String nomProfesseur=sc.nextLine();
    
                default:
                    break;
            }
        } while (choix!=6);
    }
}
