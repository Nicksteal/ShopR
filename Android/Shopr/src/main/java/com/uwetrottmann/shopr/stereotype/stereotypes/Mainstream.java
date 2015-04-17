package com.uwetrottmann.shopr.stereotype.stereotypes;

import com.uwetrottmann.shopr.R;
import com.uwetrottmann.shopr.ShoprApp;
import com.uwetrottmann.shopr.algorithm.model.Label;
import com.uwetrottmann.shopr.stereotype.user.AgeRange;
import com.uwetrottmann.shopr.stereotype.user.Job;
import com.uwetrottmann.shopr.stereotype.user.Music;

import java.util.HashMap;

/**
 * The style of the average person. Influenced by various other current fashion
 * styles, but in a less extroverted version. Clothes are typically in a price range that can
 * be afforded by most people and main brands are H&M, C&A, Esprit, GStar, NewYorker,
 * s.Oliver, Tom Tailor or Tommy Hilfiger.
 */
public class Mainstream extends AbstractStereotype {

	public Mainstream() {
		this.stereotype = Stereotype.MAINSTREAM;

		buildAgeMap();

		buildJobMap();

		buildMusicMap();

		buildBrandMap();

		buildAttributeMap();
	}

    private void buildBrandMap() {
        this.brandProbabilityMap = new HashMap<Label.Value, Integer>();
        brandProbabilityMap.put(Label.Value.A7_FOR_ALL_MANKIND, 6);
        brandProbabilityMap.put(Label.Value.ADIDAS, 7);
//		brandProbabilityMap.put(Label.Value.ALLEGRA_K, 3);
        brandProbabilityMap.put(Label.Value.ALPHA_INDUSTRIES, 4);
        brandProbabilityMap.put(Label.Value.ANNA_FIELD, 4);
        brandProbabilityMap.put(Label.Value.BEACH_PANTIES, 5);
        brandProbabilityMap.put(Label.Value.BEN_SHERMAN, 3);
        brandProbabilityMap.put(Label.Value.BENCH, 6);
        brandProbabilityMap.put(Label.Value.BENETTON, 7);
        brandProbabilityMap.put(Label.Value.BILLABONG, 5);
//		brandProbabilityMap.put(Label.Value.BOOM_BAP, 4);
        brandProbabilityMap.put(Label.Value.BOSS_ORANGE, 6);
//		brandProbabilityMap.put(Label.Value.BRAX, 7);
        brandProbabilityMap.put(Label.Value.BUGATTI, 1);
        brandProbabilityMap.put(Label.Value.BURTON, 4);
//		brandProbabilityMap.put(Label.Value.BYE_BYE_KITTY, 3);
//        brandProbabilityMap.put(Label.Value.C_DIOR, 5);
        brandProbabilityMap.put(Label.Value.CALANDO, 4);
        brandProbabilityMap.put(Label.Value.CALVIN_KLEIN, 8);
        brandProbabilityMap.put(Label.Value.CAMEL_ACTIVE, 6);
        brandProbabilityMap.put(Label.Value.CARHARTT, 5);
        brandProbabilityMap.put(Label.Value.CELIO, 7);
//		brandProbabilityMap.put(Label.Value.CHANEL, 5);
        brandProbabilityMap.put(Label.Value.COMMA, 4);
        brandProbabilityMap.put(Label.Value.CONVERSE, 5);
//		brandProbabilityMap.put(Label.Value.CUPCAKECULT, 4);
        brandProbabilityMap.put(Label.Value.DC, 4);
//		brandProbabilityMap.put(Label.Value.DENIM, 6);
        brandProbabilityMap.put(Label.Value.DICKIES, 5);
        brandProbabilityMap.put(Label.Value.DIESEL, 8);
        brandProbabilityMap.put(Label.Value.DOCKERS, 5);
        brandProbabilityMap.put(Label.Value.ESPRIT, 8);
//		brandProbabilityMap.put(Label.Value.ETNIES, 5);
        brandProbabilityMap.put(Label.Value.EVEN_N_ODD, 4);
        brandProbabilityMap.put(Label.Value.FILIPPA_K, 3);
//		brandProbabilityMap.put(Label.Value.FJÄLLRÄVEN, 7);
//		brandProbabilityMap.put(Label.Value.FOREVER_21, 6);
        brandProbabilityMap.put(Label.Value.FORVERT, 4);
        brandProbabilityMap.put(Label.Value.FRANKLIN_N_MARSHALL, 3);
        brandProbabilityMap.put(Label.Value.G_STAR, 8);
        brandProbabilityMap.put(Label.Value.GAASTRA, 2);
        brandProbabilityMap.put(Label.Value.GANT, 4);
//		brandProbabilityMap.put(Label.Value.GUCCI, 5);
        brandProbabilityMap.put(Label.Value.GUESS, 6);
//		brandProbabilityMap.put(Label.Value.H_N_M, 8);
//		brandProbabilityMap.put(Label.Value.HRLONDON, 2);
//		brandProbabilityMap.put(Label.Value.HELLBUNNY, 2);
        brandProbabilityMap.put(Label.Value.HOM, 6);
        brandProbabilityMap.put(Label.Value.HUGO_BOSS, 6);
//		brandProbabilityMap.put(Label.Value.INNOCENT, 1);
//		brandProbabilityMap.put(Label.Value.J_CREW, 7);
        brandProbabilityMap.put(Label.Value.J_LINDEBERG, 3);
        brandProbabilityMap.put(Label.Value.JACK_N_JONES, 6);
        brandProbabilityMap.put(Label.Value.JOOP, 4);
        brandProbabilityMap.put(Label.Value.KAFFE, 4);
        brandProbabilityMap.put(Label.Value.KHUJO, 2);
        brandProbabilityMap.put(Label.Value.KIOMI, 4);
        brandProbabilityMap.put(Label.Value.KOOKAI, 6);
        brandProbabilityMap.put(Label.Value.LACOSTE, 6);
        brandProbabilityMap.put(Label.Value.LAGERFELD, 2);
        brandProbabilityMap.put(Label.Value.LEE, 6);
        brandProbabilityMap.put(Label.Value.LEVI_S, 8);
//		brandProbabilityMap.put(Label.Value.LIVINGDEADSOULS, 1);
        brandProbabilityMap.put(Label.Value.LOGOSHIRT, 5);
//		brandProbabilityMap.put(Label.Value.LOUIS_VUITTON, 5);
        brandProbabilityMap.put(Label.Value.LRG, 4);
        brandProbabilityMap.put(Label.Value.LTB, 5);
        brandProbabilityMap.put(Label.Value.LYLE_N_SCOTT, 3);
        brandProbabilityMap.put(Label.Value.MARC_O_POLO, 4);
        brandProbabilityMap.put(Label.Value.MAVI, 5);
        brandProbabilityMap.put(Label.Value.MAZE, 3);
        brandProbabilityMap.put(Label.Value.MAZINE, 5);
        brandProbabilityMap.put(Label.Value.MEXX, 7);
        brandProbabilityMap.put(Label.Value.MODSTROEM, 6);
        brandProbabilityMap.put(Label.Value.MORE_N_MORE, 4);
        brandProbabilityMap.put(Label.Value.MORGAN, 6);
        brandProbabilityMap.put(Label.Value.MOEVE, 3);
        brandProbabilityMap.put(Label.Value.NAF_NAF, 4);
        brandProbabilityMap.put(Label.Value.NAPAPIJRI, 4);
//		brandProbabilityMap.put(Label.Value.NEW_YORKER, 8);
        brandProbabilityMap.put(Label.Value.NIKE, 7);
        brandProbabilityMap.put(Label.Value.OAKWOOD, 4);
        brandProbabilityMap.put(Label.Value.OLYMP_LEVEL_5, 6);
        brandProbabilityMap.put(Label.Value.ONLY, 7);
        brandProbabilityMap.put(Label.Value.ONLY_N_SONS, 2);
        brandProbabilityMap.put(Label.Value.OPUS, 4);
        brandProbabilityMap.put(Label.Value.ORLEBAR_BROWN, 6);
        brandProbabilityMap.put(Label.Value.PATAGONIA, 3);
        brandProbabilityMap.put(Label.Value.PEPE, 8);
        brandProbabilityMap.put(Label.Value.PIER_ONE, 4);
//		brandProbabilityMap.put(Label.Value.PRADA, 5);
        brandProbabilityMap.put(Label.Value.PUMA, 6);
        brandProbabilityMap.put(Label.Value.QUIKSILVER, 3);
//		brandProbabilityMap.put(Label.Value.RALPH_LAUREN, 6);
        brandProbabilityMap.put(Label.Value.RAINS, 5);
//		brandProbabilityMap.put(Label.Value.REEBOK, 6);
        brandProbabilityMap.put(Label.Value.RENE_LEZARD, 2);
        brandProbabilityMap.put(Label.Value.ROSEMUNDE, 4);
        brandProbabilityMap.put(Label.Value.ROXY, 5);
        brandProbabilityMap.put(Label.Value.S_OLIVER, 8);
        brandProbabilityMap.put(Label.Value.SCHIESSER, 6);
        brandProbabilityMap.put(Label.Value.SCHOTT_NYC, 5);
        brandProbabilityMap.put(Label.Value.SCOTCH_N_SODA, 8);
        brandProbabilityMap.put(Label.Value.SEAFOLLY, 4);
        brandProbabilityMap.put(Label.Value.SELECTED_FEMME, 4);
        brandProbabilityMap.put(Label.Value.SELECTED_HOMME, 4);
        brandProbabilityMap.put(Label.Value.SEIDENSTICKER, 2);
        brandProbabilityMap.put(Label.Value.SISLEY, 4);
//		brandProbabilityMap.put(Label.Value.SPIRAL, 1);
//		brandProbabilityMap.put(Label.Value.SUPERDRY, 7);
        brandProbabilityMap.put(Label.Value.SUPERTRASH, 2);
        brandProbabilityMap.put(Label.Value.SWEET_PANTS, 4);
        brandProbabilityMap.put(Label.Value.SWING, 3);
        brandProbabilityMap.put(Label.Value.TEDDY_SMITH, 5);
        brandProbabilityMap.put(Label.Value.TIGER_OF_SWEDEN, 4);
        brandProbabilityMap.put(Label.Value.TOM_TAILOR, 8);
        brandProbabilityMap.put(Label.Value.TOMMY_HILFIGER, 8);
        brandProbabilityMap.put(Label.Value.TWINTIP, 5);
        brandProbabilityMap.put(Label.Value.URBAN_CLASSICS, 6);
        brandProbabilityMap.put(Label.Value.VANS, 5);
        brandProbabilityMap.put(Label.Value.VERO_MODA, 5);
        brandProbabilityMap.put(Label.Value.VERSACE, 4);
        brandProbabilityMap.put(Label.Value.VILA, 4);
        brandProbabilityMap.put(Label.Value.VOLCOM, 3);
        brandProbabilityMap.put(Label.Value.VOSSEN, 4);
        brandProbabilityMap.put(Label.Value.WRANGLER, 7);
        brandProbabilityMap.put(Label.Value.YOUR_TURN, 4);
        brandProbabilityMap.put(Label.Value.ZALANDO, 9);

    }

    private void buildAttributeMap() {
		this.attributeProbabilityMap = new HashMap<String, Integer>();
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.acryl), 4);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.athletic), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.baggy), 3);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.blue), 7);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.brown), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.cremeColored), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.triangle), 4);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.dark), 6);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.emo), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.tight), 6);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.yellow), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.girly), 4);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.grey), 6);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.green), 6);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.light), 7);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.lightblue), 7);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.hoody), 4);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.classic), 4);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.curt), 4);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.leather), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.lilac), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.logo), 6);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.girl), 4);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.swatch), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.navy), 7);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.neon), 3);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.original), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.pink), 3);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.plush), 1);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.retro), 4);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.romantic), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.red), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.ribbon), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.cord), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.sport), 4);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.sporty), 4);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.black), 7);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.saying), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.street), 6);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.stripes), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.used), 6);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.vintage), 6);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.white), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.gold), 3);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.silver), 3);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.petrol), 7);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.olive), 5);

	}

	private void buildMusicMap() {
		this.musicTaste = new HashMap<Music, Integer>();
		musicTaste.put(Music.ELECTRONIC, 4);
		musicTaste.put(Music.POP, 8);
		musicTaste.put(Music.ROCK, 7);
		musicTaste.put(Music.CLASSIC, 3);
		musicTaste.put(Music.JAZZ, 2);
		musicTaste.put(Music.DNB, 2);
		musicTaste.put(Music.HIP_HOP, 2);
		musicTaste.put(Music.FOLK, 3);
		musicTaste.put(Music.INDIE, 4);
	}

	private void buildJobMap() {
		this.jobs = new HashMap<Job, Integer>();
		jobs.put(Job.PUPIL, 4);
		jobs.put(Job.STUDENT, 5);
		jobs.put(Job.MANAGER, 7);
		jobs.put(Job.SALESPERSON, 4);
		jobs.put(Job.CASHIER, 5);
		jobs.put(Job.COOK, 5);
		jobs.put(Job.WAITER, 4);
		jobs.put(Job.NURSE, 4);
		jobs.put(Job.CUSTOMER_SERVICE_REPRESENTATIVE, 5);
		jobs.put(Job.CARPENTER, 5);
		jobs.put(Job.SECRETARY, 7);
		jobs.put(Job.ASSISTANT, 7);
		jobs.put(Job.LAWYER, 8);
		jobs.put(Job.PROGRAMMER, 4);
		jobs.put(Job.ATHLETE, 6);
		jobs.put(Job.RESEARCHER, 7);
        jobs.put(Job.UNEMPLOYED, 6);
		jobs.put(Job.OTHER, 0);
	}

	private void buildAgeMap() {
		this.ageRange = new HashMap<AgeRange, Integer>();
		ageRange.put(AgeRange.CHILD, 2);
		ageRange.put(AgeRange.TEENAGER, 3);
		ageRange.put(AgeRange.YOUNG_ADULT, 4);
		ageRange.put(AgeRange.ADULT, 7);
		ageRange.put(AgeRange.OLDER_ADULT, 7);
		ageRange.put(AgeRange.SENIOR, 5);
	}
}
