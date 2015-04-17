package com.uwetrottmann.shopr.stereotype.stereotypes;

import com.uwetrottmann.shopr.R;
import com.uwetrottmann.shopr.ShoprApp;
import com.uwetrottmann.shopr.algorithm.model.Label;
import com.uwetrottmann.shopr.stereotype.user.AgeRange;
import com.uwetrottmann.shopr.stereotype.user.Job;
import com.uwetrottmann.shopr.stereotype.user.Music;

import java.util.HashMap;

/**
 * Created by yannick on 29.01.15.
 *
 * Fashion style of people mostly above 40 years of age who have established a certain
 * lifestyle combined with a high stable income. Clothes are in the upper price range, mostly
 * plain and feature colors like black, white, blue or red for women. Typical brands are
 * Versace, Prada, J.Crew, Lacoste, Gucci, Dior, Brax and Hugo Boss.
 */
public class Classy extends AbstractStereotype {

    public Classy() {
        this.stereotype = Stereotype.CLASSY;
        buildAgeMap();
        buildJobMap();
        buildMusicMap();
        buildBrandMap();
        buildAttributeMap();
    }

    private void buildAttributeMap() {
        this.attributeProbabilityMap = new HashMap<String, Integer>();
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.acryl), 1);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.athletic), 2);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.baggy), 1);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.blue), 7);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.brown), 7);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.cremeColored), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.triangle), 1);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.dark), 7);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.emo), 1);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.tight), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.yellow), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.girly), 1);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.grey), 6);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.green), 3);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.light), 6);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.lightblue), 8);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.hoody), 1);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.classic), 9);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.curt), 3);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.leather), 3);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.lilac), 4);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.logo), 1);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.girl), 1);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.swatch), 2);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.navy), 6);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.neon), 2);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.original), 1);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.pink), 3);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.plush), 1);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.retro), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.romantic), 3);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.red), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.ribbon), 3);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.cord), 3);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.sport), 2);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.sporty), 2);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.black), 8);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.saying), 1);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.street), 1);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.stripes), 3);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.used), 1);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.vintage), 1);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.white), 8);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.gold), 2);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.silver), 2);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.petrol), 7);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.olive), 4);

    }

    private void buildBrandMap() {
        this.brandProbabilityMap = new HashMap<Label.Value, Integer>();
        brandProbabilityMap.put(Label.Value.A7_FOR_ALL_MANKIND, 4);
        brandProbabilityMap.put(Label.Value.ADIDAS, 2);
//        brandProbabilityMap.put(Label.Value.ALLEGRA_K, 4);
        brandProbabilityMap.put(Label.Value.ALPHA_INDUSTRIES, 2);
        brandProbabilityMap.put(Label.Value.ANNA_FIELD, 6);
        brandProbabilityMap.put(Label.Value.BEACH_PANTIES, 8);
        brandProbabilityMap.put(Label.Value.BEN_SHERMAN, 6);
        brandProbabilityMap.put(Label.Value.BENCH, 5);
        brandProbabilityMap.put(Label.Value.BENETTON, 6);
        brandProbabilityMap.put(Label.Value.BILLABONG, 4);
//        brandProbabilityMap.put(Label.Value.BOOM_BAP, 2);
        brandProbabilityMap.put(Label.Value.BOSS_ORANGE, 9);
//        brandProbabilityMap.put(Label.Value.BRAX, 9);
        brandProbabilityMap.put(Label.Value.BUGATTI, 9);
        brandProbabilityMap.put(Label.Value.BURTON, 2);
//        brandProbabilityMap.put(Label.Value.BYE_BYE_KITTY, 2);
//        brandProbabilityMap.put(Label.Value.C_DIOR, 8);
        brandProbabilityMap.put(Label.Value.CALANDO, 5);
        brandProbabilityMap.put(Label.Value.CALVIN_KLEIN, 6);
        brandProbabilityMap.put(Label.Value.CAMEL_ACTIVE, 5);
        brandProbabilityMap.put(Label.Value.CARHARTT, 2);
        brandProbabilityMap.put(Label.Value.CELIO, 2);
//        brandProbabilityMap.put(Label.Value.CHANEL, 8);
        brandProbabilityMap.put(Label.Value.COMMA, 6);
        brandProbabilityMap.put(Label.Value.CONVERSE, 1);
//        brandProbabilityMap.put(Label.Value.CUPCAKECULT, 1);
        brandProbabilityMap.put(Label.Value.DC, 1);
//        brandProbabilityMap.put(Label.Value.DENIM, 2);
        brandProbabilityMap.put(Label.Value.DICKIES, 1);
        brandProbabilityMap.put(Label.Value.DIESEL, 4);
        brandProbabilityMap.put(Label.Value.DOCKERS, 4);
        brandProbabilityMap.put(Label.Value.ESPRIT, 5);
//        brandProbabilityMap.put(Label.Value.ETNIES, 1);
        brandProbabilityMap.put(Label.Value.EVEN_N_ODD, 1);
        brandProbabilityMap.put(Label.Value.FILIPPA_K, 6);
//        brandProbabilityMap.put(Label.Value.FJÄLLRÄVEN, 3);
//        brandProbabilityMap.put(Label.Value.FOREVER_21, 3);
        brandProbabilityMap.put(Label.Value.FORVERT, 4);
        brandProbabilityMap.put(Label.Value.FRANKLIN_N_MARSHALL, 1);
        brandProbabilityMap.put(Label.Value.G_STAR, 5);
        brandProbabilityMap.put(Label.Value.GAASTRA, 4);
        brandProbabilityMap.put(Label.Value.GANT, 2);
//        brandProbabilityMap.put(Label.Value.GUCCI, 8);
        brandProbabilityMap.put(Label.Value.GUESS, 3);
//        brandProbabilityMap.put(Label.Value.H_N_M, 4);
//        brandProbabilityMap.put(Label.Value.HRLONDON, 2);
//        brandProbabilityMap.put(Label.Value.HELLBUNNY, 1);
        brandProbabilityMap.put(Label.Value.HOM, 7);
        brandProbabilityMap.put(Label.Value.HUGO_BOSS, 9);
//        brandProbabilityMap.put(Label.Value.INNOCENT, 1);
//        brandProbabilityMap.put(Label.Value.J_CREW, 9);
        brandProbabilityMap.put(Label.Value.J_LINDEBERG, 2);
        brandProbabilityMap.put(Label.Value.JACK_N_JONES, 3);
        brandProbabilityMap.put(Label.Value.JOOP, 8);
        brandProbabilityMap.put(Label.Value.KAFFE, 3);
        brandProbabilityMap.put(Label.Value.KHUJO, 4);
        brandProbabilityMap.put(Label.Value.KIOMI, 3);
        brandProbabilityMap.put(Label.Value.KOOKAI, 4);
        brandProbabilityMap.put(Label.Value.LACOSTE, 9);
        brandProbabilityMap.put(Label.Value.LAGERFELD, 9);
        brandProbabilityMap.put(Label.Value.LEE, 4);
        brandProbabilityMap.put(Label.Value.LEVI_S, 5);
//        brandProbabilityMap.put(Label.Value.LIVINGDEADSOULS, 1);
        brandProbabilityMap.put(Label.Value.LOGOSHIRT, 1);
//        brandProbabilityMap.put(Label.Value.LOUIS_VUITTON, 9);
        brandProbabilityMap.put(Label.Value.LRG, 1);
        brandProbabilityMap.put(Label.Value.LTB, 1);
        brandProbabilityMap.put(Label.Value.LYLE_N_SCOTT, 4);
        brandProbabilityMap.put(Label.Value.MARC_O_POLO, 6);
        brandProbabilityMap.put(Label.Value.MAVI, 2);
        brandProbabilityMap.put(Label.Value.MAZE, 2);
        brandProbabilityMap.put(Label.Value.MAZINE, 1);
        brandProbabilityMap.put(Label.Value.MEXX, 2);
        brandProbabilityMap.put(Label.Value.MODSTROEM, 2);
        brandProbabilityMap.put(Label.Value.MORE_N_MORE, 5);
        brandProbabilityMap.put(Label.Value.MORGAN, 5);
        brandProbabilityMap.put(Label.Value.MOEVE, 3);
        brandProbabilityMap.put(Label.Value.NAF_NAF, 4);
        brandProbabilityMap.put(Label.Value.NAPAPIJRI, 2);
//        brandProbabilityMap.put(Label.Value.NEW_YORKER, 3);
        brandProbabilityMap.put(Label.Value.NIKE, 2);
        brandProbabilityMap.put(Label.Value.OAKWOOD, 4);
        brandProbabilityMap.put(Label.Value.OLYMP_LEVEL_5, 8);
        brandProbabilityMap.put(Label.Value.ONLY, 1);
        brandProbabilityMap.put(Label.Value.ONLY_N_SONS, 1);
        brandProbabilityMap.put(Label.Value.OPUS, 4);
        brandProbabilityMap.put(Label.Value.ORLEBAR_BROWN, 1);
        brandProbabilityMap.put(Label.Value.PATAGONIA, 3);
        brandProbabilityMap.put(Label.Value.PEPE, 5);
        brandProbabilityMap.put(Label.Value.PIER_ONE, 7);
//        brandProbabilityMap.put(Label.Value.PRADA, 9);
        brandProbabilityMap.put(Label.Value.PUMA, 2);
        brandProbabilityMap.put(Label.Value.QUIKSILVER, 1);
//        brandProbabilityMap.put(Label.Value.RALPH_LAUREN, 8);
        brandProbabilityMap.put(Label.Value.RAINS, 6);
//        brandProbabilityMap.put(Label.Value.REEBOK, 2);
        brandProbabilityMap.put(Label.Value.RENE_LEZARD, 7);
        brandProbabilityMap.put(Label.Value.ROSEMUNDE, 5);
        brandProbabilityMap.put(Label.Value.ROXY, 3);
        brandProbabilityMap.put(Label.Value.S_OLIVER, 6);
        brandProbabilityMap.put(Label.Value.SCHIESSER, 4);
        brandProbabilityMap.put(Label.Value.SCHOTT_NYC, 4);
        brandProbabilityMap.put(Label.Value.SCOTCH_N_SODA, 4);
        brandProbabilityMap.put(Label.Value.SEAFOLLY, 1);
        brandProbabilityMap.put(Label.Value.SELECTED_FEMME, 7);
        brandProbabilityMap.put(Label.Value.SELECTED_HOMME, 7);
        brandProbabilityMap.put(Label.Value.SEIDENSTICKER, 8);
        brandProbabilityMap.put(Label.Value.SISLEY, 2);
//        brandProbabilityMap.put(Label.Value.SPIRAL, 1);
//        brandProbabilityMap.put(Label.Value.SUPERDRY, 5);
        brandProbabilityMap.put(Label.Value.SUPERTRASH, 7);
        brandProbabilityMap.put(Label.Value.SWEET_PANTS, 2);
        brandProbabilityMap.put(Label.Value.SWING, 7);
        brandProbabilityMap.put(Label.Value.TEDDY_SMITH, 3);
        brandProbabilityMap.put(Label.Value.TIGER_OF_SWEDEN, 8);
        brandProbabilityMap.put(Label.Value.TOM_TAILOR, 5);
        brandProbabilityMap.put(Label.Value.TOMMY_HILFIGER, 6);
        brandProbabilityMap.put(Label.Value.TWINTIP, 1);
        brandProbabilityMap.put(Label.Value.URBAN_CLASSICS, 1);
        brandProbabilityMap.put(Label.Value.VANS, 2);
        brandProbabilityMap.put(Label.Value.VERO_MODA, 6);
        brandProbabilityMap.put(Label.Value.VERSACE, 9);
        brandProbabilityMap.put(Label.Value.VILA, 4);
        brandProbabilityMap.put(Label.Value.VOLCOM, 1);
        brandProbabilityMap.put(Label.Value.VOSSEN, 5);
        brandProbabilityMap.put(Label.Value.WRANGLER, 6);
        brandProbabilityMap.put(Label.Value.YOUR_TURN, 2);
        brandProbabilityMap.put(Label.Value.ZALANDO, 5);
    }

    private void buildMusicMap() {
        this.musicTaste = new HashMap<Music, Integer>();
        musicTaste.put(Music.ELECTRONIC, 0);
        musicTaste.put(Music.POP, 2);
        musicTaste.put(Music.ROCK, 2);
        musicTaste.put(Music.CLASSIC, 8);
        musicTaste.put(Music.JAZZ, 8);
        musicTaste.put(Music.DNB, 1);
        musicTaste.put(Music.HIP_HOP, 1);
        musicTaste.put(Music.FOLK, 6);
        musicTaste.put(Music.INDIE, 2);
    }

    private void buildJobMap() {
        this.jobs = new HashMap<Job, Integer>();
        jobs.put(Job.PUPIL, 0);
        jobs.put(Job.STUDENT, 2);
        jobs.put(Job.MANAGER, 4);
        jobs.put(Job.SALESPERSON, 3);
        jobs.put(Job.CASHIER, 2);
        jobs.put(Job.COOK, 3);
        jobs.put(Job.WAITER, 4);
        jobs.put(Job.NURSE, 3);
        jobs.put(Job.CUSTOMER_SERVICE_REPRESENTATIVE, 3);
        jobs.put(Job.CARPENTER, 2);
        jobs.put(Job.SECRETARY, 6);
        jobs.put(Job.ASSISTANT, 6);
        jobs.put(Job.LAWYER, 8);
        jobs.put(Job.PROGRAMMER, 3);
        jobs.put(Job.ATHLETE, 2);
        jobs.put(Job.RESEARCHER, 7);
        jobs.put(Job.UNEMPLOYED, 2);
        jobs.put(Job.OTHER, 0);
    }

    private void buildAgeMap() {
        this.ageRange = new HashMap<AgeRange, Integer>();
        ageRange.put(AgeRange.CHILD, 0);
        ageRange.put(AgeRange.TEENAGER, 0);
        ageRange.put(AgeRange.YOUNG_ADULT, 4);
        ageRange.put(AgeRange.ADULT, 4);
        ageRange.put(AgeRange.OLDER_ADULT, 7);
        ageRange.put(AgeRange.SENIOR, 9);
    }
}
