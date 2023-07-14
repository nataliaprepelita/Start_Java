package Homeworks.L121314_HW_Java_Collections;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Vote {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome in our vote system.");

        ArrayList<User> usersCollection = new ArrayList<>();
        ArrayList<Candidate> candidatesCollection = new ArrayList<>();

        User admin = new User("admin1", "admin2");
        admin.isAdmin = true;
        usersCollection.add(admin);
        showMenu();
        Scanner input = new Scanner(System.in);
        int action = input.nextInt();
        int authorisedUserIndex = -1; // currently no authorised users

        do {
            switch (action) {
                case 1:
                    System.out.println("1.Registration");
                    registerNewUser(usersCollection);
                    break;

                case 2:
                    System.out.println("2.Log In");
                    int userIndex = loginUser(usersCollection);
                    if (userIndex >= 0) {
                        authorisedUserIndex = userIndex;
                    } else System.out.println("User not exist!");

                    break;

                case 3:
                    System.out.println("3.Log out");
                    authorisedUserIndex = -1;
                    System.out.println("Log out was successful.");
                    break;

                case 4:
                    System.out.println("4.Add candidate");
                    if (authorisedUserIndex == -1) {
                        System.out.println("Please, Log In first.");
                        break;
                    }

                    User adm = usersCollection.get(authorisedUserIndex);
                    if (adm.isAdmin) {
                        addCandidate(candidatesCollection);
                        printListOfCandidates(candidatesCollection);
                    } else {
                        System.out.println("You haven't access to this action.");
                    }
                    break;

                case 5:
                    System.out.println("5.Vote");
                    if (authorisedUserIndex >= 0) {
                        User currentAuthorised = usersCollection.get(authorisedUserIndex);
                        vote(currentAuthorised, candidatesCollection);
                    } else System.out.println("Please, Log In first.");
                    break;

                case 6:
                    System.out.println("6.Show voting results.");
                    for (Candidate candidate : candidatesCollection) {
                        System.out.println(candidate.toString());
                    }
                    break;

                case 7:
                    System.out.println("7.Show the winner.");
                    if (candidatesCollection.isEmpty()) {
                        System.out.println("There is no candidates.");
                        break;
                    }

                    int winnerCounter = 0;
                    Candidate winnerCandidate = null;
                    for (Candidate candidate : candidatesCollection) {
                        if (candidate.countVote > winnerCounter) {
                            winnerCounter = candidate.countVote;
                            winnerCandidate = candidate;
                        }
                    }
                    if (winnerCandidate == null) {
                        System.out.println("There is no winner.");
                    } else {
                        System.out.println("The winner is: " + winnerCandidate.toString());
                    }
                    break;
            }

            showMenu();
            action = input.nextInt();

        } while (action != 99);

    }

    public static void vote(User user, ArrayList<Candidate> candidatesCollection) {
        if (user.doVote) {
            return;
        }
        System.out.println("Please choose candidate");
        printListOfCandidates(candidatesCollection);
        Scanner input = new Scanner(System.in);
        int votingChoice = input.nextInt();
        for (Candidate candidate : candidatesCollection) {
            if (candidate.getIdentificationNr() == votingChoice) {
                candidate.countVote++;
                user.doVote = true;
            }
        }
    }

    static void showMenu() {
        System.out.println("Choose the action:\n");
        System.out.println("1.Registration\n2.Log In\n3.Log out\n4.Add candidate\n5.Vote\n6.Show voting results.\n7.Show the winner.\n99.Exit the program.");
    }

    public static void registerNewUser(ArrayList<User> usersCollection) {
        Scanner credentialsIn = new Scanner(System.in);
        System.out.println("Login: " + "\nPassword:");
        String login = credentialsIn.nextLine();
        String password = credentialsIn.nextLine();
        User newUser = new User(login, password);

        if (!usersCollection.isEmpty()) {
            for (int i = 0; i < usersCollection.size(); i++) {
                if (usersCollection.get(i).getLogin().hashCode() == login.hashCode()) {
                    System.out.println("This login is already in use. Please use another.");
                    registerNewUser(usersCollection);
                }
            }
        }
        usersCollection.add(newUser);
        System.out.println("User saved.");

        System.out.println("Do you want to create another account? 1 - Yes / 2 - No");

        if (credentialsIn.nextInt() == 1) {
            registerNewUser(usersCollection);
        }
    }

    public static int loginUser(ArrayList<User> usersCollection) {
        System.out.println("Enter your login: ");
        Scanner in = new Scanner(System.in);
        String log = in.nextLine();
        System.out.println("Enter your password: ");
        String pas = in.nextLine();

        for (int j = 0; j < usersCollection.size(); j++) {
            int collectionUserLogin = usersCollection.get(j).getLogin().hashCode();
            int collectionUserPass = usersCollection.get(j).getPassword().hashCode();

            if (log.hashCode() == collectionUserLogin & pas.hashCode() == collectionUserPass) {
                System.out.println("You are authorized.");
                return j;
            }
        }
        return -1;
    }

    public static void addCandidate(ArrayList<Candidate> candidatesCollection) {
        Scanner number = new Scanner(System.in);
        Scanner nameOfCandidate = new Scanner(System.in);
        Scanner partyOfCandidate = new Scanner(System.in);
        Scanner choice = new Scanner(System.in);

        System.out.println("Enter the information about candidate in next order: \n1.Identification number\n2.Name\n3.Party");
        int idNr = number.nextInt();
        String name = nameOfCandidate.nextLine();
        String party = partyOfCandidate.nextLine();

        Candidate newCandidate = new Candidate(idNr, name, party);

        if (!candidatesCollection.isEmpty()) {
            for (int i = 0; i < candidatesCollection.size(); i++) {
                if (candidatesCollection.get(i).getIdentificationNr() == idNr) {
                    System.out.println("This candidate is already registered.");
                    addCandidate(candidatesCollection);
                }
            }
        }
        candidatesCollection.add(newCandidate);
        System.out.println("A new candidate is added.");

        System.out.println("Do you want to add another candidate? Enter 1 for Yes and 2 - No.");
        if (choice.nextInt() == 1) {
            addCandidate(candidatesCollection);
        }
    }

    public static void printListOfCandidates(ArrayList<Candidate> candidatesCollection) {
        for (Candidate representatives : candidatesCollection) {
            System.out.println(representatives);
        }
    }
}
