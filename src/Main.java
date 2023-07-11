/*
Jeevitha just started work as a programming trainer for UIT’s Placement Cell.
 She is paid Rs.100 an hour, with a few exceptions.
 She earns an extra Rs.15 an hour for any part of a day where she works more than 8 hours,
 and an extra Rs.25 an hour for hours beyond 40 in any one week.
 Also, she earns a 25% bonus for working on Saturday and a 50% bonus for working on Sunday.
 The bonuses for Saturday and Sunday are computed based on the hours worked those days;
 they are not used to calculate any bonus for working more than 40 hours in a week.
 You’ll be given the number of hours Jeevitha worked on each day in a week (Sunday, Monday, ..., Saturday),
  and you need to compute her salary for the week.
Input consists of 7 integers less than or equal to 24 on separate lines.
Print Jeevitha’s weekly salary as output.
 */
import java.util.Scanner;

class Main{
    public static void main(String []args){
        Scanner scanner=new Scanner(System.in);

                int Sunday = scanner.nextInt();
                int Monday = scanner.nextInt();
                int Tuesday = scanner.nextInt();
                int Wednesday = scanner.nextInt();
                int Thursday = scanner.nextInt();
                int Friday = scanner.nextInt();
                int Saturday = scanner.nextInt();
                int bonus, weeklyBonus, extraWeekSalary ,salaryMonday, salaryTuesday, salaryWednesday, salaryThursday, salaryFriday, extraHour=0;
                int salarySat= Saturday * 125;
                int salarySun= Sunday * 150;

                if(Monday > 8)
                {
                    extraHour = Monday - 8;
                    bonus = extraHour * 115;
                    salaryMonday = bonus + 800;
                }
                else
                {
                    salaryMonday = Monday * 100;
                }


                if(Tuesday > 8)
                {
                    extraHour = Tuesday - 8;
                    bonus = extraHour * 115;
                    salaryTuesday = bonus + 800;
                }
                else
                {
                    salaryTuesday = Tuesday * 100;
                }


                if(Wednesday > 8)
                {
                    extraHour = Wednesday - 8;
                    bonus = extraHour * 115;
                    salaryWednesday = bonus + 800;
                }
                else
                {
                    salaryWednesday = Wednesday *100;
                }


                if(Thursday > 8)
                {
                    extraHour = Thursday - 8;
                    bonus = extraHour * 115;
                    salaryThursday = bonus + 800;
                }
                else
                {
                    salaryThursday = Thursday * 100;
                }


                if(Friday > 8)
                {
                    extraHour = Friday - 8;
                    bonus = extraHour * 115;
                    salaryFriday = bonus + 800;
                }
                else
                {
                    salaryFriday = Friday * 100;
                }

                int totalHours = Monday + Tuesday + Wednesday + Thursday + Friday;
                if(totalHours > 40)
                {
                    weeklyBonus  = totalHours-40;
                    extraWeekSalary = weeklyBonus * 125;
                }
                int totalSalary = salaryMonday + salaryTuesday + salaryWednesday + salaryThursday + salaryFriday + salarySat + salarySun + extraWeekSalary;
                System.out.println(totalSalary);

            }
        }
