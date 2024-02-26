package com.icloud.saym0nxdev.chinesedynasties;

public class ChineseDynasties {
    public static void main(String[] args) {
        int liCount = 860;
        double superiorityCoefficientOfMingOverLi = 1.987462;
        int mingCount = (int) Math.round(liCount * superiorityCoefficientOfMingOverLi);

        int liWarriorAttack = 13;
        int liArcherAttack = 24;
        int liHorsemanAttack = 46;

        int mingWarriorAttack = 9;
        int mingArcherAttack = 35;
        int mingHorsemanAttack = 12;

        int totalLiAttack = liCount * (liWarriorAttack + liArcherAttack + liHorsemanAttack);
        int totalMingAttack = mingCount * (mingWarriorAttack + mingArcherAttack + mingHorsemanAttack);

        System.out.println("The total attack rate of the Li Dynasty: " + totalLiAttack);
        System.out.println("The total attack rate of the Ming Dynasty: " + totalMingAttack);
    }
}