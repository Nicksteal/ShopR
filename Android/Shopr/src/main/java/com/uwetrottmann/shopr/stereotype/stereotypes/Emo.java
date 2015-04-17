package com.uwetrottmann.shopr.stereotype.stereotypes;

import com.uwetrottmann.shopr.R;
import com.uwetrottmann.shopr.ShoprApp;
import com.uwetrottmann.shopr.algorithm.model.Label;
import com.uwetrottmann.shopr.stereotype.user.AgeRange;
import com.uwetrottmann.shopr.stereotype.user.Job;
import com.uwetrottmann.shopr.stereotype.user.Music;

import java.util.HashMap;

/**
 * derived from emo (emocore) music. Therefore often features emocore bands on
 * t-shirts. People tend to be sensitive, introverted and shy. Clothes typically use dark colors
 * like black, brown, grey or neon colors as a contrast. Often wear tight, slim-fit jeans.
 */
public class Emo extends AbstractStereotype {

    public Emo() {
        this.stereotype = Stereotype.EMO;
        buildAgeMap();
        buildJobMap();
        buildMusicMap();
        buildBrandMap();
        buildAttributeMap();
    }

    private void buildAttributeMap() {
        this.attributeProbabilityMap = new HashMap<String, Integer>();
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.acryl), 2);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.athletic), 2);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.baggy), 1);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.blue), 4);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.brown), 6);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.cremeColored), 4);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.triangle), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.dark), 9);
        attributeProbabilityMap.put(ShoprApp.getContext()
                .getString(R.string.emo), 10);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.tight), 8);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.yellow), 3);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.girly), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.grey), 7);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.green), 3);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.light), 2);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.lightblue), 2);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.hoody), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.classic), 1);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.curt), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.leather), 3);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.lilac), 6);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.logo), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.girl), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.swatch), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.navy), 3);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.neon), 7);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.original), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.pink), 6);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.plush), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.retro), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.romantic), 7);
        attributeProbabilityMap.put(ShoprApp.getContext()
                .getString(R.string.red), 7);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.ribbon), 7);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.cord), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.sport), 2);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.sporty), 2);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.black), 8);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.saying), 3);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.street), 1);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.stripes), 4);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.used), 2);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.vintage), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.white), 4);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.gold), 1);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.silver), 1);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.petrol), 2);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.olive), 4);
    }

    private void buildBrandMap() {
        this.brandProbabilityMap = new HashMap<Label.Value, Integer>();
        brandProbabilityMap.put(Label.Value.A7_FOR_ALL_MANKIND, 2);
        brandProbabilityMap.put(Label.Value.ADIDAS, 1);
//        brandProbabilityMap.put(Label.Value.ALLEGRA_K, 6);
        brandProbabilityMap.put(Label.Value.ALPHA_INDUSTRIES, 4);
        brandProbabilityMap.put(Label.Value.ANNA_FIELD, 4);
        brandProbabilityMap.put(Label.Value.BEACH_PANTIES, 5);
        brandProbabilityMap.put(Label.Value.BEN_SHERMAN, 6);
        brandProbabilityMap.put(Label.Value.BENCH, 3);
        brandProbabilityMap.put(Label.Value.BENETTON, 5);
        brandProbabilityMap.put(Label.Value.BILLABONG, 3);
//        brandProbabilityMap.put(Label.Value.BOOM_BAP, 4);
        brandProbabilityMap.put(Label.Value.BOSS_ORANGE, 1);
//        brandProbabilityMap.put(Label.Value.BRAX, 1);
        brandProbabilityMap.put(Label.Value.BUGATTI, 2);
        brandProbabilityMap.put(Label.Value.BURTON, 5);
//        brandProbabilityMap.put(Label.Value.BYE_BYE_KITTY, 9);
//        brandProbabilityMap.put(Label.Value.C_DIOR, 1);
        brandProbabilityMap.put(Label.Value.CALANDO, 2);
        brandProbabilityMap.put(Label.Value.CALVIN_KLEIN, 2);
        brandProbabilityMap.put(Label.Value.CAMEL_ACTIVE, 2);
        brandProbabilityMap.put(Label.Value.CARHARTT, 1);
        brandProbabilityMap.put(Label.Value.CELIO, 3);
//        brandProbabilityMap.put(Label.Value.CHANEL, 1);
        brandProbabilityMap.put(Label.Value.COMMA, 2);
        brandProbabilityMap.put(Label.Value.CONVERSE, 5);
//        brandProbabilityMap.put(Label.Value.CUPCAKECULT, 9);
        brandProbabilityMap.put(Label.Value.DC, 1);
//        brandProbabilityMap.put(Label.Value.DENIM, 4);
        brandProbabilityMap.put(Label.Value.DICKIES, 2);
        brandProbabilityMap.put(Label.Value.DIESEL, 3);
        brandProbabilityMap.put(Label.Value.DOCKERS, 1);
        brandProbabilityMap.put(Label.Value.ESPRIT, 3);
//        brandProbabilityMap.put(Label.Value.ETNIES, 3);
        brandProbabilityMap.put(Label.Value.EVEN_N_ODD, 6);
        brandProbabilityMap.put(Label.Value.FILIPPA_K, 2);
//        brandProbabilityMap.put(Label.Value.FJÄLLRÄVEN, 3);
//        brandProbabilityMap.put(Label.Value.FOREVER_21, 5);
        brandProbabilityMap.put(Label.Value.FORVERT, 1);
        brandProbabilityMap.put(Label.Value.FRANKLIN_N_MARSHALL, 2);
        brandProbabilityMap.put(Label.Value.G_STAR, 3);
        brandProbabilityMap.put(Label.Value.GAASTRA, 4);
        brandProbabilityMap.put(Label.Value.GANT, 1);
//        brandProbabilityMap.put(Label.Value.GUCCI, 1);
        brandProbabilityMap.put(Label.Value.GUESS, 5);
//        brandProbabilityMap.put(Label.Value.H_N_M, 1);
//        brandProbabilityMap.put(Label.Value.HRLONDON, 9);
//        brandProbabilityMap.put(Label.Value.HELLBUNNY, 9);
        brandProbabilityMap.put(Label.Value.HOM, 5);
        brandProbabilityMap.put(Label.Value.HUGO_BOSS, 1);
//        brandProbabilityMap.put(Label.Value.INNOCENT, 9);
//        brandProbabilityMap.put(Label.Value.J_CREW, 2);
        brandProbabilityMap.put(Label.Value.J_LINDEBERG, 5);
        brandProbabilityMap.put(Label.Value.JACK_N_JONES, 2);
        brandProbabilityMap.put(Label.Value.JOOP, 1);
        brandProbabilityMap.put(Label.Value.KAFFE, 1);
        brandProbabilityMap.put(Label.Value.KHUJO, 1);
        brandProbabilityMap.put(Label.Value.KIOMI, 5);
        brandProbabilityMap.put(Label.Value.KOOKAI, 5);
        brandProbabilityMap.put(Label.Value.LACOSTE, 1);
        brandProbabilityMap.put(Label.Value.LAGERFELD, 1);
        brandProbabilityMap.put(Label.Value.LEE, 5);
        brandProbabilityMap.put(Label.Value.LEVI_S, 3);
//        brandProbabilityMap.put(Label.Value.LIVINGDEADSOULS, 8);
        brandProbabilityMap.put(Label.Value.LOGOSHIRT, 5);
//        brandProbabilityMap.put(Label.Value.LOUIS_VUITTON, 1);
        brandProbabilityMap.put(Label.Value.LRG, 2);
        brandProbabilityMap.put(Label.Value.LTB, 3);
        brandProbabilityMap.put(Label.Value.LYLE_N_SCOTT, 1);
        brandProbabilityMap.put(Label.Value.MARC_O_POLO, 1);
        brandProbabilityMap.put(Label.Value.MAVI, 5);
        brandProbabilityMap.put(Label.Value.MAZE, 4);
        brandProbabilityMap.put(Label.Value.MAZINE, 2);
        brandProbabilityMap.put(Label.Value.MEXX, 3);
        brandProbabilityMap.put(Label.Value.MODSTROEM, 2);
        brandProbabilityMap.put(Label.Value.MORE_N_MORE, 4);
        brandProbabilityMap.put(Label.Value.MORGAN, 2);
        brandProbabilityMap.put(Label.Value.MOEVE, 3);
        brandProbabilityMap.put(Label.Value.NAF_NAF, 1);
        brandProbabilityMap.put(Label.Value.NAPAPIJRI, 3);
//        brandProbabilityMap.put(Label.Value.NEW_YORKER, 2);
        brandProbabilityMap.put(Label.Value.NIKE, 2);
        brandProbabilityMap.put(Label.Value.OAKWOOD, 1);
        brandProbabilityMap.put(Label.Value.OLYMP_LEVEL_5, 1);
        brandProbabilityMap.put(Label.Value.ONLY, 1);
        brandProbabilityMap.put(Label.Value.ONLY_N_SONS, 1);
        brandProbabilityMap.put(Label.Value.OPUS, 3);
        brandProbabilityMap.put(Label.Value.ORLEBAR_BROWN, 6);
        brandProbabilityMap.put(Label.Value.PATAGONIA, 1);
        brandProbabilityMap.put(Label.Value.PEPE, 3);
        brandProbabilityMap.put(Label.Value.PIER_ONE, 6);
//        brandProbabilityMap.put(Label.Value.PRADA, 1);
        brandProbabilityMap.put(Label.Value.PUMA, 2);
        brandProbabilityMap.put(Label.Value.QUIKSILVER, 1);
//        brandProbabilityMap.put(Label.Value.RALPH_LAUREN, 1);
        brandProbabilityMap.put(Label.Value.RAINS, 3);
//        brandProbabilityMap.put(Label.Value.REEBOK, 2);
        brandProbabilityMap.put(Label.Value.RENE_LEZARD, 2);
        brandProbabilityMap.put(Label.Value.ROSEMUNDE, 2);
        brandProbabilityMap.put(Label.Value.ROXY, 3);
        brandProbabilityMap.put(Label.Value.S_OLIVER, 1);
        brandProbabilityMap.put(Label.Value.SCHIESSER, 5);
        brandProbabilityMap.put(Label.Value.SCHOTT_NYC, 4);
        brandProbabilityMap.put(Label.Value.SCOTCH_N_SODA, 3);
        brandProbabilityMap.put(Label.Value.SEAFOLLY, 1);
        brandProbabilityMap.put(Label.Value.SELECTED_FEMME, 3);
        brandProbabilityMap.put(Label.Value.SELECTED_HOMME, 2);
        brandProbabilityMap.put(Label.Value.SEIDENSTICKER, 3);
        brandProbabilityMap.put(Label.Value.SISLEY, 3);
//        brandProbabilityMap.put(Label.Value.SPIRAL, 9);
//        brandProbabilityMap.put(Label.Value.SUPERDRY, 1);
        brandProbabilityMap.put(Label.Value.SUPERTRASH, 4);
        brandProbabilityMap.put(Label.Value.SWEET_PANTS, 4);
        brandProbabilityMap.put(Label.Value.SWING, 2);
        brandProbabilityMap.put(Label.Value.TEDDY_SMITH, 6);
        brandProbabilityMap.put(Label.Value.TIGER_OF_SWEDEN, 1);
        brandProbabilityMap.put(Label.Value.TOM_TAILOR, 2);
        brandProbabilityMap.put(Label.Value.TOMMY_HILFIGER, 2);
        brandProbabilityMap.put(Label.Value.TWINTIP, 2);
        brandProbabilityMap.put(Label.Value.URBAN_CLASSICS, 3);
        brandProbabilityMap.put(Label.Value.VANS, 3);
        brandProbabilityMap.put(Label.Value.VERO_MODA, 5);
        brandProbabilityMap.put(Label.Value.VERSACE, 1);
        brandProbabilityMap.put(Label.Value.VILA, 1);
        brandProbabilityMap.put(Label.Value.VOLCOM, 4);
        brandProbabilityMap.put(Label.Value.VOSSEN, 1);
        brandProbabilityMap.put(Label.Value.WRANGLER, 6);
        brandProbabilityMap.put(Label.Value.YOUR_TURN, 2);
        brandProbabilityMap.put(Label.Value.ZALANDO, 2);
    }

    private void buildMusicMap() {
        this.musicTaste = new HashMap<Music, Integer>();
        musicTaste.put(Music.ELECTRONIC, 1);
        musicTaste.put(Music.POP, 6);
        musicTaste.put(Music.ROCK, 7);
        musicTaste.put(Music.CLASSIC, 1);
        musicTaste.put(Music.JAZZ, 0);
        musicTaste.put(Music.DNB, 3);
        musicTaste.put(Music.HIP_HOP, 0);
        musicTaste.put(Music.FOLK, 2);
        musicTaste.put(Music.INDIE, 6);
    }

    private void buildJobMap() {
        this.jobs = new HashMap<Job, Integer>();
        jobs.put(Job.PUPIL, 8);
        jobs.put(Job.STUDENT, 6);
        jobs.put(Job.MANAGER, 1);
        jobs.put(Job.SALESPERSON, 5);
        jobs.put(Job.CASHIER, 6);
        jobs.put(Job.COOK, 4);
        jobs.put(Job.WAITER, 6);
        jobs.put(Job.NURSE, 7);
        jobs.put(Job.CUSTOMER_SERVICE_REPRESENTATIVE, 5);
        jobs.put(Job.CARPENTER, 2);
        jobs.put(Job.SECRETARY, 2);
        jobs.put(Job.ASSISTANT, 4);
        jobs.put(Job.LAWYER, 1);
        jobs.put(Job.PROGRAMMER, 7);
        jobs.put(Job.ATHLETE, 0);
        jobs.put(Job.RESEARCHER, 4);
        jobs.put(Job.UNEMPLOYED, 5);
        jobs.put(Job.OTHER, 0);
    }

    private void buildAgeMap() {
        this.ageRange = new HashMap<AgeRange, Integer>();
        ageRange.put(AgeRange.CHILD, 0);
        ageRange.put(AgeRange.TEENAGER, 10);
        ageRange.put(AgeRange.YOUNG_ADULT, 7);
        ageRange.put(AgeRange.ADULT, 3);
        ageRange.put(AgeRange.OLDER_ADULT, 1);
        ageRange.put(AgeRange.SENIOR, 0);
    }
}
