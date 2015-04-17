package com.uwetrottmann.shopr.stereotype.stereotypes;

import com.uwetrottmann.shopr.R;
import com.uwetrottmann.shopr.ShoprApp;
import com.uwetrottmann.shopr.algorithm.model.Label;
import com.uwetrottmann.shopr.stereotype.user.AgeRange;
import com.uwetrottmann.shopr.stereotype.user.Job;
import com.uwetrottmann.shopr.stereotype.user.Music;

import java.util.HashMap;

/**
 * Created by Yannick on 29.01.15.
 *
 * Mostly a male stereotype. Relates to a person that does a lot of sports or is
 * a big sports fan. Wears training outfits or outfits that emphasize their physique on a daily
 * basis. Brands are typically sports brands like Nike, Adidas, Puma and the like.
 */
public class Athlete extends AbstractStereotype {

    public Athlete() {
        this.stereotype = Stereotype.ATHLETE;
        buildAgeRangeMap();
        buildJobMap();
        buildMusicMap();
        buildBrandMap();
        buildAttributeMap();
    }

    private void buildAttributeMap() {
        this.attributeProbabilityMap = new HashMap<String, Integer>();
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.acryl), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.athletic), 9);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.baggy), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.blue), 6);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.brown), 6);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.cremeColored), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.triangle), 4);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.dark), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.emo), 1);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.tight), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.yellow), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.girly), 3);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.grey), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.green), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.light), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.lightblue), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.hoody), 7);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.classic), 2);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.curt), 7);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.leather), 1);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.lilac), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.logo), 7);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.girl), 2);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.swatch), 6);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.navy), 6);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.neon), 4);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.original), 3);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.pink), 4);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.plush), 2);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.retro), 2);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.romantic), 1);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.red), 4);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.ribbon), 1);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.cord), 1);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.sport), 9);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.sporty), 9);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.black), 6);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.saying), 7);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.street), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.stripes), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.used), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.vintage), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.white), 6);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.gold), 1);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.silver), 1);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.petrol), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.olive), 5);

    }

    private void buildBrandMap() {
        this.brandProbabilityMap = new HashMap<Label.Value, Integer>();
        brandProbabilityMap.put(Label.Value.A7_FOR_ALL_MANKIND, 3);
        brandProbabilityMap.put(Label.Value.ADIDAS, 9);
//        brandProbabilityMap.put(Label.Value.ALLEGRA_K, 2);
        brandProbabilityMap.put(Label.Value.ALPHA_INDUSTRIES, 7);
        brandProbabilityMap.put(Label.Value.ANNA_FIELD, 3);
        brandProbabilityMap.put(Label.Value.BEACH_PANTIES, 3);
        brandProbabilityMap.put(Label.Value.BEN_SHERMAN, 2);
        brandProbabilityMap.put(Label.Value.BENCH, 6);
        brandProbabilityMap.put(Label.Value.BENETTON, 2);
        brandProbabilityMap.put(Label.Value.BILLABONG, 5);
//        brandProbabilityMap.put(Label.Value.BOOM_BAP, 5);
        brandProbabilityMap.put(Label.Value.BOSS_ORANGE, 5);
//        brandProbabilityMap.put(Label.Value.BRAX, 5);
        brandProbabilityMap.put(Label.Value.BUGATTI, 2);
        brandProbabilityMap.put(Label.Value.BURTON, 7);
//        brandProbabilityMap.put(Label.Value.BYE_BYE_KITTY, 2);
//        brandProbabilityMap.put(Label.Value.C_DIOR, 2);
        brandProbabilityMap.put(Label.Value.CALANDO, 4);
        brandProbabilityMap.put(Label.Value.CALVIN_KLEIN, 5);
        brandProbabilityMap.put(Label.Value.CAMEL_ACTIVE, 2);
        brandProbabilityMap.put(Label.Value.CARHARTT, 6);
        brandProbabilityMap.put(Label.Value.CELIO, 3);
//        brandProbabilityMap.put(Label.Value.CHANEL, 2);
        brandProbabilityMap.put(Label.Value.COMMA, 1);
        brandProbabilityMap.put(Label.Value.CONVERSE, 7);
//        brandProbabilityMap.put(Label.Value.CUPCAKECULT, 2);
        brandProbabilityMap.put(Label.Value.DC, 7);
//        brandProbabilityMap.put(Label.Value.DENIM, 7);
        brandProbabilityMap.put(Label.Value.DICKIES, 7);
        brandProbabilityMap.put(Label.Value.DIESEL, 7);
        brandProbabilityMap.put(Label.Value.DOCKERS, 3);
        brandProbabilityMap.put(Label.Value.ESPRIT, 6);
//        brandProbabilityMap.put(Label.Value.ETNIES, 7);
        brandProbabilityMap.put(Label.Value.EVEN_N_ODD, 2);
        brandProbabilityMap.put(Label.Value.FILIPPA_K, 1);
//        brandProbabilityMap.put(Label.Value.FJÄLLRÄVEN, 8);
//        brandProbabilityMap.put(Label.Value.FOREVER_21, 4);
        brandProbabilityMap.put(Label.Value.FORVERT, 1);
        brandProbabilityMap.put(Label.Value.FRANKLIN_N_MARSHALL, 8);
        brandProbabilityMap.put(Label.Value.G_STAR, 6);
        brandProbabilityMap.put(Label.Value.GAASTRA, 3);
        brandProbabilityMap.put(Label.Value.GANT, 2);
//        brandProbabilityMap.put(Label.Value.GUCCI, 3);
        brandProbabilityMap.put(Label.Value.GUESS, 1);
//        brandProbabilityMap.put(Label.Value.H_N_M, 5);
//        brandProbabilityMap.put(Label.Value.HRLONDON, 2);
//        brandProbabilityMap.put(Label.Value.HELLBUNNY, 3);
        brandProbabilityMap.put(Label.Value.HOM, 2);
        brandProbabilityMap.put(Label.Value.HUGO_BOSS, 5);
//        brandProbabilityMap.put(Label.Value.INNOCENT, 3);
//        brandProbabilityMap.put(Label.Value.J_CREW, 4);
        brandProbabilityMap.put(Label.Value.J_LINDEBERG, 3);
        brandProbabilityMap.put(Label.Value.JACK_N_JONES, 5);
        brandProbabilityMap.put(Label.Value.JOOP, 2);
        brandProbabilityMap.put(Label.Value.KAFFE, 1);
        brandProbabilityMap.put(Label.Value.KHUJO, 4);
        brandProbabilityMap.put(Label.Value.KIOMI, 1);
        brandProbabilityMap.put(Label.Value.KOOKAI, 1);
        brandProbabilityMap.put(Label.Value.LACOSTE, 5);
        brandProbabilityMap.put(Label.Value.LAGERFELD, 2);
        brandProbabilityMap.put(Label.Value.LEE, 4);
        brandProbabilityMap.put(Label.Value.LEVI_S, 6);
//        brandProbabilityMap.put(Label.Value.LIVINGDEADSOULS, 2);
        brandProbabilityMap.put(Label.Value.LOGOSHIRT, 2);
//        brandProbabilityMap.put(Label.Value.LOUIS_VUITTON, 2);
        brandProbabilityMap.put(Label.Value.LRG, 5);
        brandProbabilityMap.put(Label.Value.LTB, 2);
        brandProbabilityMap.put(Label.Value.LYLE_N_SCOTT, 2);
        brandProbabilityMap.put(Label.Value.MARC_O_POLO, 1);
        brandProbabilityMap.put(Label.Value.MAVI, 1);
        brandProbabilityMap.put(Label.Value.MAZE, 2);
        brandProbabilityMap.put(Label.Value.MAZINE, 6);
        brandProbabilityMap.put(Label.Value.MEXX, 3);
        brandProbabilityMap.put(Label.Value.MODSTROEM, 1);
        brandProbabilityMap.put(Label.Value.MORE_N_MORE, 1);
        brandProbabilityMap.put(Label.Value.MORGAN, 2);
        brandProbabilityMap.put(Label.Value.MOEVE, 6);
        brandProbabilityMap.put(Label.Value.NAF_NAF, 2);
        brandProbabilityMap.put(Label.Value.NAPAPIJRI, 2);
//        brandProbabilityMap.put(Label.Value.NEW_YORKER, 6);
        brandProbabilityMap.put(Label.Value.NIKE, 9);
        brandProbabilityMap.put(Label.Value.OAKWOOD, 2);
        brandProbabilityMap.put(Label.Value.OLYMP_LEVEL_5, 1);
        brandProbabilityMap.put(Label.Value.ONLY, 2);
        brandProbabilityMap.put(Label.Value.ONLY_N_SONS, 3);
        brandProbabilityMap.put(Label.Value.OPUS, 1);
        brandProbabilityMap.put(Label.Value.ORLEBAR_BROWN, 6);
        brandProbabilityMap.put(Label.Value.PATAGONIA, 8);
        brandProbabilityMap.put(Label.Value.PEPE, 6);
        brandProbabilityMap.put(Label.Value.PIER_ONE, 1);
//        brandProbabilityMap.put(Label.Value.PRADA, 2);
        brandProbabilityMap.put(Label.Value.PUMA, 9);
        brandProbabilityMap.put(Label.Value.QUIKSILVER, 7);
//        brandProbabilityMap.put(Label.Value.RALPH_LAUREN, 4);
        brandProbabilityMap.put(Label.Value.RAINS, 3);
//        brandProbabilityMap.put(Label.Value.REEBOK, 9);
        brandProbabilityMap.put(Label.Value.RENE_LEZARD, 2);
        brandProbabilityMap.put(Label.Value.ROSEMUNDE, 2);
        brandProbabilityMap.put(Label.Value.ROXY, 5);
        brandProbabilityMap.put(Label.Value.S_OLIVER, 6);
        brandProbabilityMap.put(Label.Value.SCHIESSER, 4);
        brandProbabilityMap.put(Label.Value.SCHOTT_NYC, 5);
        brandProbabilityMap.put(Label.Value.SCOTCH_N_SODA, 6);
        brandProbabilityMap.put(Label.Value.SEAFOLLY, 3);
        brandProbabilityMap.put(Label.Value.SELECTED_FEMME, 2);
        brandProbabilityMap.put(Label.Value.SELECTED_HOMME, 2);
        brandProbabilityMap.put(Label.Value.SEIDENSTICKER, 2);
        brandProbabilityMap.put(Label.Value.SISLEY, 1);
//        brandProbabilityMap.put(Label.Value.SPIRAL, 2);
//        brandProbabilityMap.put(Label.Value.SUPERDRY, 5);
        brandProbabilityMap.put(Label.Value.SUPERTRASH, 2);
        brandProbabilityMap.put(Label.Value.SWEET_PANTS, 5);
        brandProbabilityMap.put(Label.Value.SWING, 2);
        brandProbabilityMap.put(Label.Value.TEDDY_SMITH, 3);
        brandProbabilityMap.put(Label.Value.TIGER_OF_SWEDEN, 2);
        brandProbabilityMap.put(Label.Value.TOM_TAILOR, 5);
        brandProbabilityMap.put(Label.Value.TOMMY_HILFIGER, 5);
        brandProbabilityMap.put(Label.Value.TWINTIP, 7);
        brandProbabilityMap.put(Label.Value.URBAN_CLASSICS, 5);
        brandProbabilityMap.put(Label.Value.VANS, 6);
        brandProbabilityMap.put(Label.Value.VERO_MODA, 2);
        brandProbabilityMap.put(Label.Value.VERSACE, 2);
        brandProbabilityMap.put(Label.Value.VILA, 1);
        brandProbabilityMap.put(Label.Value.VOLCOM, 5);
        brandProbabilityMap.put(Label.Value.VOSSEN, 3);
        brandProbabilityMap.put(Label.Value.WRANGLER, 2);
        brandProbabilityMap.put(Label.Value.YOUR_TURN,7);
        brandProbabilityMap.put(Label.Value.ZALANDO, 5);

    }

    private void buildMusicMap() {
        this.musicTaste = new HashMap<Music, Integer>();
        musicTaste.put(Music.ELECTRONIC, 3);
        musicTaste.put(Music.POP, 5);
        musicTaste.put(Music.ROCK, 6);
        musicTaste.put(Music.CLASSIC, 2);
        musicTaste.put(Music.JAZZ, 1);
        musicTaste.put(Music.DNB, 5);
        musicTaste.put(Music.HIP_HOP, 6);
        musicTaste.put(Music.FOLK, 3);
        musicTaste.put(Music.INDIE, 3);
    }

    private void buildJobMap() {
        this.jobs = new HashMap<Job, Integer>();
        jobs.put(Job.PUPIL, 6);
        jobs.put(Job.STUDENT, 7);
        jobs.put(Job.MANAGER, 3);
        jobs.put(Job.SALESPERSON, 5);
        jobs.put(Job.CASHIER, 3);
        jobs.put(Job.COOK, 4);
        jobs.put(Job.WAITER, 4);
        jobs.put(Job.NURSE, 3);
        jobs.put(Job.CUSTOMER_SERVICE_REPRESENTATIVE, 4);
        jobs.put(Job.CARPENTER, 7);
        jobs.put(Job.SECRETARY, 4);
        jobs.put(Job.ASSISTANT, 5);
        jobs.put(Job.LAWYER, 2);
        jobs.put(Job.PROGRAMMER, 4);
        jobs.put(Job.ATHLETE, 10);
        jobs.put(Job.RESEARCHER, 3);
        jobs.put(Job.UNEMPLOYED, 5);
        jobs.put(Job.OTHER, 0);
    }

    private void buildAgeRangeMap() {
        this.ageRange = new HashMap<AgeRange, Integer>();
        ageRange.put(AgeRange.CHILD, 1);
        ageRange.put(AgeRange.TEENAGER, 8);
        ageRange.put(AgeRange.YOUNG_ADULT, 7);
        ageRange.put(AgeRange.ADULT, 5);
        ageRange.put(AgeRange.OLDER_ADULT, 3);
        ageRange.put(AgeRange.SENIOR, 1);
    }
}
