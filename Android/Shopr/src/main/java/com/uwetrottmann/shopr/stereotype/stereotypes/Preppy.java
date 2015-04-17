package com.uwetrottmann.shopr.stereotype.stereotypes;

import com.uwetrottmann.shopr.R;
import com.uwetrottmann.shopr.ShoprApp;
import com.uwetrottmann.shopr.algorithm.model.Label;
import com.uwetrottmann.shopr.stereotype.user.AgeRange;
import com.uwetrottmann.shopr.stereotype.user.Job;
import com.uwetrottmann.shopr.stereotype.user.Music;

import java.util.HashMap;

/**
 * A person who cares a lot about personal appearance. Preppy people are typically
 * seen as happy, successful and well groomed. Clothes are usually clean cut and have a
 * classical feeling to them. They use bright colors like green, pink, light blue, white, navy
 * blue, stripes or argyle. Brands are highly priced and include J.Crew, Lacoste or Ralph
 * Lauren among others.
 */
public class Preppy extends AbstractStereotype {

	public Preppy() {
		this.stereotype = Stereotype.PREPPY;

		buildAgeMap();

		buildJobMap();

		buildMusicMap();

		buildBrandMap();

		buildAttributeMap();
	}

    private void buildBrandMap() {
        this.brandProbabilityMap = new HashMap<Label.Value, Integer>();
        brandProbabilityMap.put(Label.Value.A7_FOR_ALL_MANKIND, 6);
        brandProbabilityMap.put(Label.Value.ADIDAS, 5);
//		brandProbabilityMap.put(Label.Value.ALLEGRA_K, 6);
        brandProbabilityMap.put(Label.Value.ALPHA_INDUSTRIES, 3);
        brandProbabilityMap.put(Label.Value.ANNA_FIELD, 5);
        brandProbabilityMap.put(Label.Value.BEACH_PANTIES, 7);
        brandProbabilityMap.put(Label.Value.BEN_SHERMAN, 8);
        brandProbabilityMap.put(Label.Value.BENCH, 2);
        brandProbabilityMap.put(Label.Value.BENETTON, 4);
        brandProbabilityMap.put(Label.Value.BILLABONG, 2);
//		brandProbabilityMap.put(Label.Value.BOOM_BAP, 3);
        brandProbabilityMap.put(Label.Value.BOSS_ORANGE, 8);
//		brandProbabilityMap.put(Label.Value.BRAX, 9);
        brandProbabilityMap.put(Label.Value.BUGATTI, 7);
        brandProbabilityMap.put(Label.Value.BURTON, 5);
//		brandProbabilityMap.put(Label.Value.BYE_BYE_KITTY, 1);
//        brandProbabilityMap.put(Label.Value.C_DIOR, 9);
        brandProbabilityMap.put(Label.Value.CALANDO, 2);
        brandProbabilityMap.put(Label.Value.CALVIN_KLEIN, 6);
        brandProbabilityMap.put(Label.Value.CAMEL_ACTIVE, 4);
        brandProbabilityMap.put(Label.Value.CARHARTT, 2);
        brandProbabilityMap.put(Label.Value.CELIO, 4);
//		brandProbabilityMap.put(Label.Value.CHANEL, 9);
        brandProbabilityMap.put(Label.Value.COMMA, 6);
        brandProbabilityMap.put(Label.Value.CONVERSE, 2);
//		brandProbabilityMap.put(Label.Value.CUPCAKECULT, 1);
        brandProbabilityMap.put(Label.Value.DC, 1);
//		brandProbabilityMap.put(Label.Value.DENIM, 4);
        brandProbabilityMap.put(Label.Value.DICKIES, 1);
        brandProbabilityMap.put(Label.Value.DIESEL, 5);
        brandProbabilityMap.put(Label.Value.DOCKERS, 4);
        brandProbabilityMap.put(Label.Value.ESPRIT, 6);
//		brandProbabilityMap.put(Label.Value.ETNIES, 2);
        brandProbabilityMap.put(Label.Value.EVEN_N_ODD, 4);
        brandProbabilityMap.put(Label.Value.FILIPPA_K, 7);
//		brandProbabilityMap.put(Label.Value.FJÄLLRÄVEN, 6);
//		brandProbabilityMap.put(Label.Value.FOREVER_21, 5);
        brandProbabilityMap.put(Label.Value.FORVERT, 5);
        brandProbabilityMap.put(Label.Value.FRANKLIN_N_MARSHALL, 1);
        brandProbabilityMap.put(Label.Value.G_STAR, 7);
        brandProbabilityMap.put(Label.Value.GAASTRA, 6);
        brandProbabilityMap.put(Label.Value.GANT, 8);
//		brandProbabilityMap.put(Label.Value.GUCCI, 9);
        brandProbabilityMap.put(Label.Value.GUESS, 3);
//		brandProbabilityMap.put(Label.Value.H_N_M, 6);
//		brandProbabilityMap.put(Label.Value.HRLONDON, 1);
//		brandProbabilityMap.put(Label.Value.HELLBUNNY, 1);
        brandProbabilityMap.put(Label.Value.HOM, 3);
        brandProbabilityMap.put(Label.Value.HUGO_BOSS, 9);
//		brandProbabilityMap.put(Label.Value.INNOCENT, 1);
//		brandProbabilityMap.put(Label.Value.J_CREW, 9);
        brandProbabilityMap.put(Label.Value.J_LINDEBERG, 9);
        brandProbabilityMap.put(Label.Value.JACK_N_JONES, 4);
        brandProbabilityMap.put(Label.Value.JOOP, 6);
        brandProbabilityMap.put(Label.Value.KAFFE, 3);
        brandProbabilityMap.put(Label.Value.KHUJO, 4);
        brandProbabilityMap.put(Label.Value.KIOMI, 1);
        brandProbabilityMap.put(Label.Value.KOOKAI, 5);
        brandProbabilityMap.put(Label.Value.LACOSTE, 9);
        brandProbabilityMap.put(Label.Value.LAGERFELD, 5);
        brandProbabilityMap.put(Label.Value.LEE, 4);
        brandProbabilityMap.put(Label.Value.LEVI_S, 7);
//		brandProbabilityMap.put(Label.Value.LIVINGDEADSOULS, 1);
        brandProbabilityMap.put(Label.Value.LOGOSHIRT, 1);
//		brandProbabilityMap.put(Label.Value.LOUIS_VUITTON, 9);
        brandProbabilityMap.put(Label.Value.LRG, 1);
        brandProbabilityMap.put(Label.Value.LTB, 3);
        brandProbabilityMap.put(Label.Value.LYLE_N_SCOTT, 9);
        brandProbabilityMap.put(Label.Value.MARC_O_POLO, 7);
        brandProbabilityMap.put(Label.Value.MAVI, 2);
        brandProbabilityMap.put(Label.Value.MAZE, 1);
        brandProbabilityMap.put(Label.Value.MAZINE, 1);
        brandProbabilityMap.put(Label.Value.MEXX, 5);
        brandProbabilityMap.put(Label.Value.MODSTROEM, 6);
        brandProbabilityMap.put(Label.Value.MORE_N_MORE, 4);
        brandProbabilityMap.put(Label.Value.MORGAN, 5);
        brandProbabilityMap.put(Label.Value.MOEVE, 2);
        brandProbabilityMap.put(Label.Value.NAF_NAF, 4);
        brandProbabilityMap.put(Label.Value.NAPAPIJRI, 3);
//		brandProbabilityMap.put(Label.Value.NEW_YORKER, 6);
        brandProbabilityMap.put(Label.Value.NIKE, 5);
        brandProbabilityMap.put(Label.Value.OAKWOOD, 5);
        brandProbabilityMap.put(Label.Value.OLYMP_LEVEL_5, 8);
        brandProbabilityMap.put(Label.Value.ONLY, 2);
        brandProbabilityMap.put(Label.Value.ONLY_N_SONS, 1);
        brandProbabilityMap.put(Label.Value.OPUS, 2);
        brandProbabilityMap.put(Label.Value.ORLEBAR_BROWN, 2);
        brandProbabilityMap.put(Label.Value.PATAGONIA, 2);
        brandProbabilityMap.put(Label.Value.PEPE, 5);
        brandProbabilityMap.put(Label.Value.PIER_ONE, 7);
//		brandProbabilityMap.put(Label.Value.PRADA, 9);
        brandProbabilityMap.put(Label.Value.PUMA, 5);
        brandProbabilityMap.put(Label.Value.QUIKSILVER, 3);
//		brandProbabilityMap.put(Label.Value.RALPH_LAUREN, 9);
        brandProbabilityMap.put(Label.Value.RAINS, 4);
//		brandProbabilityMap.put(Label.Value.REEBOK, 5);
        brandProbabilityMap.put(Label.Value.RENE_LEZARD, 6);
        brandProbabilityMap.put(Label.Value.ROSEMUNDE, 5);
        brandProbabilityMap.put(Label.Value.ROXY, 2);
        brandProbabilityMap.put(Label.Value.S_OLIVER, 7);
        brandProbabilityMap.put(Label.Value.SCHIESSER, 2);
        brandProbabilityMap.put(Label.Value.SCHOTT_NYC, 3);
        brandProbabilityMap.put(Label.Value.SCOTCH_N_SODA, 6);
        brandProbabilityMap.put(Label.Value.SEAFOLLY, 7);
        brandProbabilityMap.put(Label.Value.SELECTED_FEMME, 6);
        brandProbabilityMap.put(Label.Value.SELECTED_HOMME, 5);
        brandProbabilityMap.put(Label.Value.SEIDENSTICKER, 3);
        brandProbabilityMap.put(Label.Value.SISLEY, 7);
//		brandProbabilityMap.put(Label.Value.SPIRAL, 1);
//		brandProbabilityMap.put(Label.Value.SUPERDRY, 6);
        brandProbabilityMap.put(Label.Value.SUPERTRASH, 5);
        brandProbabilityMap.put(Label.Value.SWEET_PANTS, 4);
        brandProbabilityMap.put(Label.Value.SWING, 6);
        brandProbabilityMap.put(Label.Value.TEDDY_SMITH, 4);
        brandProbabilityMap.put(Label.Value.TIGER_OF_SWEDEN, 7);
        brandProbabilityMap.put(Label.Value.TOM_TAILOR, 4);
        brandProbabilityMap.put(Label.Value.TOMMY_HILFIGER, 6);
        brandProbabilityMap.put(Label.Value.TWINTIP, 2);
        brandProbabilityMap.put(Label.Value.URBAN_CLASSICS, 3);
        brandProbabilityMap.put(Label.Value.VANS, 3);
        brandProbabilityMap.put(Label.Value.VERO_MODA, 4);
        brandProbabilityMap.put(Label.Value.VERSACE, 9);
        brandProbabilityMap.put(Label.Value.VILA, 6);
        brandProbabilityMap.put(Label.Value.VOSSEN, 4);
        brandProbabilityMap.put(Label.Value.VOLCOM, 3);
        brandProbabilityMap.put(Label.Value.WRANGLER, 7);
        brandProbabilityMap.put(Label.Value.YOUR_TURN, 4);
        brandProbabilityMap.put(Label.Value.ZALANDO, 5);
    }

    private void buildAttributeMap() {
		this.attributeProbabilityMap = new HashMap<String, Integer>();
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.acryl), 3);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.athletic), 3);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.baggy), 1);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.blue), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.brown), 4);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.cremeColored), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.triangle), 1);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.dark), 4);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.emo), 1);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.tight), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.yellow), 6);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.girly), 4);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.grey), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.green), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.light), 7);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.lightblue), 7);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.hoody), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.classic), 6);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.curt), 4);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.leather), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.lilac), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.logo), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.girl), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.swatch), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.navy), 6);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.neon), 4);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.original), 1);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.pink), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.plush), 1);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.retro), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.romantic), 1);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.red), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.ribbon), 1);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.cord), 1);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.sport), 6);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.sporty), 6);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.black), 4);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.saying), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.street), 1);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.stripes), 1);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.used), 1);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.vintage), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.white), 6);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.gold), 2);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.silver), 2);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.petrol), 8);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.olive), 4);
	}

	private void buildMusicMap() {
		this.musicTaste = new HashMap<Music, Integer>();
		musicTaste.put(Music.ELECTRONIC, 2);
		musicTaste.put(Music.POP, 4);
		musicTaste.put(Music.ROCK, 4);
		musicTaste.put(Music.CLASSIC, 6);
		musicTaste.put(Music.JAZZ, 6);
		musicTaste.put(Music.DNB, 4);
		musicTaste.put(Music.HIP_HOP, 1);
		musicTaste.put(Music.FOLK, 6);
		musicTaste.put(Music.INDIE, 5);
	}

	private void buildJobMap() {
		this.jobs = new HashMap<Job, Integer>();
		jobs.put(Job.PUPIL, 6);
		jobs.put(Job.STUDENT, 6);
		jobs.put(Job.MANAGER, 8);
		jobs.put(Job.SALESPERSON, 9);
		jobs.put(Job.CASHIER, 5);
		jobs.put(Job.COOK, 4);
		jobs.put(Job.WAITER, 3);
		jobs.put(Job.NURSE, 3);
		jobs.put(Job.CUSTOMER_SERVICE_REPRESENTATIVE, 8);
		jobs.put(Job.CARPENTER, 3);
		jobs.put(Job.SECRETARY, 6);
		jobs.put(Job.ASSISTANT, 6);
		jobs.put(Job.LAWYER, 9);
		jobs.put(Job.PROGRAMMER, 2);
		jobs.put(Job.ATHLETE, 5);
		jobs.put(Job.RESEARCHER, 4);
        jobs.put(Job.UNEMPLOYED, 2);
		jobs.put(Job.OTHER, 0);
	}

	private void buildAgeMap() {
		this.ageRange = new HashMap<AgeRange, Integer>();
		ageRange.put(AgeRange.CHILD, 7);
		ageRange.put(AgeRange.TEENAGER, 5);
		ageRange.put(AgeRange.YOUNG_ADULT, 6);
		ageRange.put(AgeRange.ADULT, 8);
		ageRange.put(AgeRange.OLDER_ADULT, 7);
		ageRange.put(AgeRange.SENIOR, 4);
	}
}
