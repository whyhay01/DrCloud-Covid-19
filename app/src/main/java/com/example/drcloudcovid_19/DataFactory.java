package com.example.drcloudcovid_19;

import android.os.Parcelable;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.Arrays;
import java.util.List;

public class DataFactory {

    public static List<MyJourney> makeJourney(){
        return Arrays.asList(makeFirstJourney(),makeSecondJourney()
                ,makeThirdJourney(), makeForthJourney(),makeFifthJourney(),
                makeSixthJourney(),makeSeventhJourney());
    }

    private static MyJourney makeSeventhJourney() {
        return new MyJourney("BROADENING SCOPE", makeJourneyProgress(), R.drawable.icon_done);
    }

    private static MyJourney makeSixthJourney() {
        return new MyJourney("MOVING FORWARD", makeJourneyProgress(), R.drawable.icon_done);
    }

    private static MyJourney makeFifthJourney() {
        return new MyJourney("REVISITING", makeJourneyProgress(), R.drawable.icon_done);
    }

    private static MyJourney makeForthJourney() {
        return new MyJourney("EXPLORING FURTHER", makeJourneyProgress(), R.drawable.icon_done);
    }

    private static MyJourney makeThirdJourney() {
        return new MyJourney("MAKING PROGRESS", makeJourneyProgress(), R.drawable.icon_done);
    }

    private static MyJourney makeSecondJourney() {
        return new MyJourney("FIRST STEPS", makeJourneyProgress(), R.drawable.icon_done);
    }

    private static MyJourney makeFirstJourney() {
        return new MyJourney("INTAKE", makeJourneyProgress(), R.drawable.icon_done);
    }

    private static List<JourneyProgress> makeJourneyProgress() {
        JourneyProgress progress1 = new JourneyProgress("Progress1","Sub-progress1",false);
        JourneyProgress progress2 = new JourneyProgress("Progress2","Sub-progress2",true);
        JourneyProgress progress3 = new JourneyProgress("Progress3","Sub-progress3",true);
        JourneyProgress progress4 = new JourneyProgress("Progress4","Sub-progress4",true);
        JourneyProgress progress5 = new JourneyProgress("Progress5","Sub-progress5",true);
        JourneyProgress progress6 = new JourneyProgress("Progress6","Sub-progress6",false);
        JourneyProgress progress7 = new JourneyProgress("Progress7","Sub-progress7",false);
        return Arrays.asList(progress1,progress2,progress3,progress4,progress5,progress6,progress7);
    }

    public static List<ExpandableGroup<? extends Parcelable>> makeGuideline(){
        return Arrays.asList(makeFirstGuideline(),
                makeSecondGuideline(),
                makeThirdGuideline(),
                makeForthGuideline(),
                makeFifthJourney(),
                makeSixthGuideline());
    }
    private static List<Articles> makeArticles(){

        Articles article1 = new Articles("Leaping tall building",false);
        Articles article2 = new Articles("Choosing the right shoes",false);
        Articles article3 = new Articles("Reading weather forecast",false);
        Articles article4 = new Articles("Getting my city permit",false);
        Articles article5 = new Articles("Handling media queries",false);
        Articles article6 = new Articles("Planning your landing",false);

        return Arrays.asList(article1,article2, article3, article4, article5, article6);
    }

    private static Guideline makeFirstGuideline(){
        Guideline firstGuideline = new Guideline("Super Hero Guide", makeArticles());
        return firstGuideline;
    }

    private static Guideline makeSecondGuideline(){
        Guideline secondGuideline = new Guideline("Super Hero Guide", makeArticles());
        return secondGuideline;
    }

    private static Guideline makeThirdGuideline(){
        Guideline thirdGuideline = new Guideline("Super Hero Guide", makeArticles());
        return thirdGuideline;
    }

    private static Guideline makeForthGuideline(){
        Guideline forthGuideline = new Guideline("Super Hero Guide", makeArticles());
        return forthGuideline;
    }

    private static Guideline makeFifthGuideline(){
        Guideline fifthGuideline = new Guideline("Super Hero Guide", makeArticles());
        return fifthGuideline;
    }

    private static Guideline makeSixthGuideline(){
        Guideline sixthGuideline = new Guideline("Super Hero Guide", makeArticles());
        return sixthGuideline;
    }

}
