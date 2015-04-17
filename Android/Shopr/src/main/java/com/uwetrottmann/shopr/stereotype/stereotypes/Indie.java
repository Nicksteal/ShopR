package com.uwetrottmann.shopr.stereotype.stereotypes;

import com.uwetrottmann.shopr.R;
import com.uwetrottmann.shopr.ShoprApp;
import com.uwetrottmann.shopr.algorithm.model.Label;
import com.uwetrottmann.shopr.stereotype.user.AgeRange;
import com.uwetrottmann.shopr.stereotype.user.Job;
import com.uwetrottmann.shopr.stereotype.user.Music;

import java.util.HashMap;

/**
 * also known as urban, retro, vintage, “close to earth”, unmaterialistic.
 * Typical for being original, dressing different than others. Clothes use earth tones, pale
 * pink, or cream colors. Female clothing includes flowery skirts, lacy blouses or vintage
 * t-shirts.
 */
public class Indie extends AbstractStereotype {

	public Indie() {
		this.stereotype = Stereotype.INDIE;

		buildAgeMap();

		buildJobMap();

		buildMusicMap();

		buildBrandMap();

		buildAttributeMap();
	}

    private void buildBrandMap() {
        this.brandProbabilityMap = new HashMap<Label.Value, Integer>();
        brandProbabilityMap.put(Label.Value.A7_FOR_ALL_MANKIND, 7);
        brandProbabilityMap.put(Label.Value.ADIDAS, 5);
//		brandProbabilityMap.put(Label.Value.ALLEGRA_K, 6);
        brandProbabilityMap.put(Label.Value.ALPHA_INDUSTRIES, 3);
        brandProbabilityMap.put(Label.Value.ANNA_FIELD, 5);
        brandProbabilityMap.put(Label.Value.BEACH_PANTIES, 8);
        brandProbabilityMap.put(Label.Value.BEN_SHERMAN, 5);
        brandProbabilityMap.put(Label.Value.BENCH, 4);
        brandProbabilityMap.put(Label.Value.BENETTON, 3);
        brandProbabilityMap.put(Label.Value.BILLABONG, 6);
//		brandProbabilityMap.put(Label.Value.BOOM_BAP, 9);
        brandProbabilityMap.put(Label.Value.BOSS_ORANGE, 3);
//		brandProbabilityMap.put(Label.Value.BRAX, 2);
        brandProbabilityMap.put(Label.Value.BUGATTI, 1);
        brandProbabilityMap.put(Label.Value.BURTON, 4);
//		brandProbabilityMap.put(Label.Value.BYE_BYE_KITTY, 4);
//        brandProbabilityMap.put(Label.Value.C_DIOR, 2);
        brandProbabilityMap.put(Label.Value.CALANDO, 2);
        brandProbabilityMap.put(Label.Value.CALVIN_KLEIN, 4);
        brandProbabilityMap.put(Label.Value.CAMEL_ACTIVE, 5);
        brandProbabilityMap.put(Label.Value.CARHARTT, 6);
        brandProbabilityMap.put(Label.Value.CELIO, 3);
//		brandProbabilityMap.put(Label.Value.CHANEL, 3);
        brandProbabilityMap.put(Label.Value.COMMA, 5);
        brandProbabilityMap.put(Label.Value.CONVERSE, 7);
//		brandProbabilityMap.put(Label.Value.CUPCAKECULT, 6);
        brandProbabilityMap.put(Label.Value.DC, 4);
//		brandProbabilityMap.put(Label.Value.DENIM, 4);
        brandProbabilityMap.put(Label.Value.DICKIES, 4);
        brandProbabilityMap.put(Label.Value.DIESEL, 3);
        brandProbabilityMap.put(Label.Value.DOCKERS, 7);
        brandProbabilityMap.put(Label.Value.ESPRIT, 6);
//		brandProbabilityMap.put(Label.Value.ETNIES, 4);
        brandProbabilityMap.put(Label.Value.EVEN_N_ODD, 4);
        brandProbabilityMap.put(Label.Value.FILIPPA_K, 1);
//		brandProbabilityMap.put(Label.Value.FJÄLLRÄVEN, 3);
//		brandProbabilityMap.put(Label.Value.FOREVER_21, 9);
        brandProbabilityMap.put(Label.Value.FORVERT, 5);
        brandProbabilityMap.put(Label.Value.FRANKLIN_N_MARSHALL, 5);
        brandProbabilityMap.put(Label.Value.G_STAR, 7);
        brandProbabilityMap.put(Label.Value.GAASTRA, 4);
        brandProbabilityMap.put(Label.Value.GANT, 5);
//		brandProbabilityMap.put(Label.Value.GUCCI, 2);
        brandProbabilityMap.put(Label.Value.GUESS, 2);
//		brandProbabilityMap.put(Label.Value.H_N_M, 5);
//		brandProbabilityMap.put(Label.Value.HRLONDON, 2);
//		brandProbabilityMap.put(Label.Value.HELLBUNNY, 2);
        brandProbabilityMap.put(Label.Value.HOM, 4);
        brandProbabilityMap.put(Label.Value.HUGO_BOSS, 2);
//		brandProbabilityMap.put(Label.Value.INNOCENT, 2);
//		brandProbabilityMap.put(Label.Value.J_CREW, 4);
        brandProbabilityMap.put(Label.Value.J_LINDEBERG, 5);
        brandProbabilityMap.put(Label.Value.JACK_N_JONES, 2);
        brandProbabilityMap.put(Label.Value.JOOP, 5);
        brandProbabilityMap.put(Label.Value.KAFFE, 6);
        brandProbabilityMap.put(Label.Value.KHUJO, 7);
        brandProbabilityMap.put(Label.Value.KIOMI, 5);
        brandProbabilityMap.put(Label.Value.KOOKAI, 2);
        brandProbabilityMap.put(Label.Value.LACOSTE, 3);
        brandProbabilityMap.put(Label.Value.LAGERFELD, 2);
        brandProbabilityMap.put(Label.Value.LEE, 7);
        brandProbabilityMap.put(Label.Value.LEVI_S, 6);
//		brandProbabilityMap.put(Label.Value.LIVINGDEADSOULS, 2);
        brandProbabilityMap.put(Label.Value.LOGOSHIRT, 8);
//		brandProbabilityMap.put(Label.Value.LOUIS_VUITTON, 2);
        brandProbabilityMap.put(Label.Value.LRG, 4);
        brandProbabilityMap.put(Label.Value.LTB, 8);
        brandProbabilityMap.put(Label.Value.LYLE_N_SCOTT, 3);
        brandProbabilityMap.put(Label.Value.MARC_O_POLO, 1);
        brandProbabilityMap.put(Label.Value.MAVI, 6);
        brandProbabilityMap.put(Label.Value.MAZE, 8);
        brandProbabilityMap.put(Label.Value.MAZINE, 4);
        brandProbabilityMap.put(Label.Value.MEXX, 4);
        brandProbabilityMap.put(Label.Value.MODSTROEM, 7);
        brandProbabilityMap.put(Label.Value.MORE_N_MORE, 5);
        brandProbabilityMap.put(Label.Value.MORGAN, 7);
        brandProbabilityMap.put(Label.Value.MOEVE, 2);
        brandProbabilityMap.put(Label.Value.NAF_NAF, 6);
        brandProbabilityMap.put(Label.Value.NAPAPIJRI, 4);
//		brandProbabilityMap.put(Label.Value.NEW_YORKER, 6);
        brandProbabilityMap.put(Label.Value.NIKE, 4);
        brandProbabilityMap.put(Label.Value.OAKWOOD, 5);
        brandProbabilityMap.put(Label.Value.OLYMP_LEVEL_5, 4);
        brandProbabilityMap.put(Label.Value.ONLY, 3);
        brandProbabilityMap.put(Label.Value.ONLY_N_SONS, 5);
        brandProbabilityMap.put(Label.Value.OPUS, 6);
        brandProbabilityMap.put(Label.Value.ORLEBAR_BROWN, 7);
        brandProbabilityMap.put(Label.Value.PATAGONIA, 9);
        brandProbabilityMap.put(Label.Value.PEPE, 6);
        brandProbabilityMap.put(Label.Value.PIER_ONE, 2);
//		brandProbabilityMap.put(Label.Value.PRADA, 2);
        brandProbabilityMap.put(Label.Value.PUMA, 4);
        brandProbabilityMap.put(Label.Value.QUIKSILVER, 2);
//		brandProbabilityMap.put(Label.Value.RALPH_LAUREN, 4);
        brandProbabilityMap.put(Label.Value.RAINS, 6);
//		brandProbabilityMap.put(Label.Value.REEBOK, 4);
        brandProbabilityMap.put(Label.Value.RENE_LEZARD, 4);
        brandProbabilityMap.put(Label.Value.ROSEMUNDE, 4);
        brandProbabilityMap.put(Label.Value.ROXY, 7);
        brandProbabilityMap.put(Label.Value.S_OLIVER, 6);
        brandProbabilityMap.put(Label.Value.SCHIESSER, 3);
        brandProbabilityMap.put(Label.Value.SCHOTT_NYC, 4);
        brandProbabilityMap.put(Label.Value.SCOTCH_N_SODA, 8);
        brandProbabilityMap.put(Label.Value.SEAFOLLY, 8);
        brandProbabilityMap.put(Label.Value.SELECTED_FEMME, 2);
        brandProbabilityMap.put(Label.Value.SELECTED_HOMME, 2);
        brandProbabilityMap.put(Label.Value.SEIDENSTICKER, 4);
        brandProbabilityMap.put(Label.Value.SISLEY, 9);
//		brandProbabilityMap.put(Label.Value.SPIRAL, 2);
//		brandProbabilityMap.put(Label.Value.SUPERDRY, 5);
        brandProbabilityMap.put(Label.Value.SUPERTRASH, 3);
        brandProbabilityMap.put(Label.Value.SWEET_PANTS, 7);
        brandProbabilityMap.put(Label.Value.SWING, 2);
        brandProbabilityMap.put(Label.Value.TEDDY_SMITH, 4);
        brandProbabilityMap.put(Label.Value.TIGER_OF_SWEDEN, 2);
        brandProbabilityMap.put(Label.Value.TOM_TAILOR, 3);
        brandProbabilityMap.put(Label.Value.TOMMY_HILFIGER, 4);
        brandProbabilityMap.put(Label.Value.TWINTIP, 5);
        brandProbabilityMap.put(Label.Value.URBAN_CLASSICS, 3);
        brandProbabilityMap.put(Label.Value.VANS, 5);
        brandProbabilityMap.put(Label.Value.VERO_MODA, 4);
        brandProbabilityMap.put(Label.Value.VERSACE, 2);
        brandProbabilityMap.put(Label.Value.VILA, 6);
        brandProbabilityMap.put(Label.Value.VOLCOM, 9);
        brandProbabilityMap.put(Label.Value.VOSSEN, 5);
        brandProbabilityMap.put(Label.Value.WRANGLER, 5);
        brandProbabilityMap.put(Label.Value.YOUR_TURN, 6);
        brandProbabilityMap.put(Label.Value.ZALANDO, 4);
    }

    private void buildAttributeMap() {
		this.attributeProbabilityMap = new HashMap<String, Integer>();
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.acryl), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.athletic), 3);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.baggy), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.blue), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.brown), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.cremeColored), 6);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.triangle), 4);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.dark), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.emo), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.tight), 8);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.yellow), 4);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.girly), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.grey), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.green), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.light), 6);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.lightblue), 6);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.hoody), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.classic), 1);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.curt), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.leather), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.lilac), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.logo), 7);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.girl), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.swatch), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.navy), 4);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.neon), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.original), 10);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.pink), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.plush), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.retro), 8);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.romantic), 1);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.red), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.ribbon), 3);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.cord), 1);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.sport), 4);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.sporty), 4);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.black), 4);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.saying), 7);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.street), 4);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.stripes), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.used), 9);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.vintage), 8);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.white), 6);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.gold), 4);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.silver), 4);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.petrol), 6);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.olive), 7);
	}

	private void buildMusicMap() {
		this.musicTaste = new HashMap<Music, Integer>();
		musicTaste.put(Music.ELECTRONIC, 9);
		musicTaste.put(Music.POP, 4);
		musicTaste.put(Music.ROCK, 2);
		musicTaste.put(Music.CLASSIC, 0);
		musicTaste.put(Music.JAZZ, 0);
		musicTaste.put(Music.DNB, 4);
		musicTaste.put(Music.HIP_HOP, 4);
		musicTaste.put(Music.FOLK, 7);
		musicTaste.put(Music.INDIE, 9);
	}

	private void buildJobMap() {
		this.jobs = new HashMap<Job, Integer>();
		jobs.put(Job.PUPIL, 7);
		jobs.put(Job.STUDENT, 10);
		jobs.put(Job.MANAGER, 2);
		jobs.put(Job.SALESPERSON, 5);
		jobs.put(Job.CASHIER, 5);
		jobs.put(Job.COOK, 4);
		jobs.put(Job.WAITER, 7);
		jobs.put(Job.NURSE, 7);
		jobs.put(Job.CUSTOMER_SERVICE_REPRESENTATIVE, 5);
		jobs.put(Job.CARPENTER, 4);
		jobs.put(Job.SECRETARY, 3);
		jobs.put(Job.ASSISTANT, 6);
		jobs.put(Job.LAWYER, 3);
		jobs.put(Job.PROGRAMMER, 6);
		jobs.put(Job.ATHLETE, 2);
		jobs.put(Job.RESEARCHER, 4);
        jobs.put(Job.UNEMPLOYED, 5);
		jobs.put(Job.OTHER, 0);
	}

	private void buildAgeMap() {
		this.ageRange = new HashMap<AgeRange, Integer>();
		ageRange.put(AgeRange.CHILD, 2);
		ageRange.put(AgeRange.TEENAGER, 10);
		ageRange.put(AgeRange.YOUNG_ADULT, 8);
		ageRange.put(AgeRange.ADULT, 6);
		ageRange.put(AgeRange.OLDER_ADULT, 3);
		ageRange.put(AgeRange.SENIOR, 1);
	}
}
