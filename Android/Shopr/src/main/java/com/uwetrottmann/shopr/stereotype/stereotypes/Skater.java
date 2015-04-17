package com.uwetrottmann.shopr.stereotype.stereotypes;

import com.uwetrottmann.shopr.R;
import com.uwetrottmann.shopr.ShoprApp;
import com.uwetrottmann.shopr.algorithm.model.Label;
import com.uwetrottmann.shopr.stereotype.user.AgeRange;
import com.uwetrottmann.shopr.stereotype.user.Job;
import com.uwetrottmann.shopr.stereotype.user.Music;

import java.util.HashMap;

/**
 * Related to the skateboarding subculture. Closely related to the urban style. Clothes
 * typically include shirts in all colors with messages, baggy or nowadays often super tight
 * pants, as well as hoodies with big logos. Representative brands are DC, Etnies, Dickies,
 * Carhartt, Mazine or Vans.
 */
public class Skater extends AbstractStereotype {

	public Skater() {
		this.stereotype = Stereotype.SKATER;

		buildAgeMap();

		buildJobMap();

		buildMusicMap();

		buildBrandMap();

		buildAttributeMap();
	}

	private void buildBrandMap() {
        this.brandProbabilityMap = new HashMap<Label.Value, Integer>();
        brandProbabilityMap.put(Label.Value.A7_FOR_ALL_MANKIND, 5);
        brandProbabilityMap.put(Label.Value.ADIDAS, 7);
//		brandProbabilityMap.put(Label.Value.ALLEGRA_K, 2);
        brandProbabilityMap.put(Label.Value.ALPHA_INDUSTRIES, 5);
        brandProbabilityMap.put(Label.Value.ANNA_FIELD, 2);
        brandProbabilityMap.put(Label.Value.BEACH_PANTIES, 2);
        brandProbabilityMap.put(Label.Value.BEN_SHERMAN, 2);
        brandProbabilityMap.put(Label.Value.BENCH, 6);
        brandProbabilityMap.put(Label.Value.BENETTON, 4);
        brandProbabilityMap.put(Label.Value.BILLABONG, 6);
//		brandProbabilityMap.put(Label.Value.BOOM_BAP, 7);
        brandProbabilityMap.put(Label.Value.BOSS_ORANGE, 1);
//		brandProbabilityMap.put(Label.Value.BRAX, 1);
        brandProbabilityMap.put(Label.Value.BUGATTI, 2);
        brandProbabilityMap.put(Label.Value.BURTON, 9);
//		brandProbabilityMap.put(Label.Value.BYE_BYE_KITTY, 2);
//        brandProbabilityMap.put(Label.Value.C_DIOR, 1);
        brandProbabilityMap.put(Label.Value.CALANDO, 1);
        brandProbabilityMap.put(Label.Value.CALVIN_KLEIN, 4);
        brandProbabilityMap.put(Label.Value.CAMEL_ACTIVE, 2);
        brandProbabilityMap.put(Label.Value.CARHARTT, 7);
        brandProbabilityMap.put(Label.Value.CELIO, 4);
//		brandProbabilityMap.put(Label.Value.CHANEL, 2);
        brandProbabilityMap.put(Label.Value.COMMA, 2);
        brandProbabilityMap.put(Label.Value.CONVERSE, 8);
//		brandProbabilityMap.put(Label.Value.CUPCAKECULT, 2);
        brandProbabilityMap.put(Label.Value.DC, 9);
//		brandProbabilityMap.put(Label.Value.DENIM, 7);
        brandProbabilityMap.put(Label.Value.DICKIES, 9);
        brandProbabilityMap.put(Label.Value.DIESEL, 5);
        brandProbabilityMap.put(Label.Value.DOCKERS, 1);
        brandProbabilityMap.put(Label.Value.ESPRIT, 6);
//		brandProbabilityMap.put(Label.Value.ETNIES, 9);
        brandProbabilityMap.put(Label.Value.EVEN_N_ODD, 2);
        brandProbabilityMap.put(Label.Value.FILIPPA_K, 1);
//		brandProbabilityMap.put(Label.Value.FJÄLLRÄVEN, 5);
//		brandProbabilityMap.put(Label.Value.FOREVER_21, 3);
        brandProbabilityMap.put(Label.Value.FORVERT, 3);
        brandProbabilityMap.put(Label.Value.FRANKLIN_N_MARSHALL, 5);
        brandProbabilityMap.put(Label.Value.G_STAR, 5);
        brandProbabilityMap.put(Label.Value.GAASTRA, 3);
        brandProbabilityMap.put(Label.Value.GANT, 3);
//		brandProbabilityMap.put(Label.Value.GUCCI, 1);
        brandProbabilityMap.put(Label.Value.GUESS, 2);
//		brandProbabilityMap.put(Label.Value.H_N_M, 4);
//		brandProbabilityMap.put(Label.Value.HRLONDON, 1);
        brandProbabilityMap.put(Label.Value.HUGO_BOSS, 1);
//        brandProbabilityMap.put(Label.Value.HELLBUNNY, 1);
        brandProbabilityMap.put(Label.Value.HOM, 1);
//		brandProbabilityMap.put(Label.Value.INNOCENT, 1);
//		brandProbabilityMap.put(Label.Value.J_CREW, 2);
        brandProbabilityMap.put(Label.Value.J_LINDEBERG, 2);
        brandProbabilityMap.put(Label.Value.JACK_N_JONES, 3);
        brandProbabilityMap.put(Label.Value.JOOP, 2);
        brandProbabilityMap.put(Label.Value.KAFFE, 1);
        brandProbabilityMap.put(Label.Value.KHUJO, 1);
        brandProbabilityMap.put(Label.Value.KIOMI, 1);
        brandProbabilityMap.put(Label.Value.KOOKAI, 1);
        brandProbabilityMap.put(Label.Value.LACOSTE, 2);
        brandProbabilityMap.put(Label.Value.LAGERFELD, 1);
        brandProbabilityMap.put(Label.Value.LEE, 2);
        brandProbabilityMap.put(Label.Value.LEVI_S, 5);
//		brandProbabilityMap.put(Label.Value.LIVINGDEADSOULS, 1);
        brandProbabilityMap.put(Label.Value.LOGOSHIRT, 8);
//		brandProbabilityMap.put(Label.Value.LOUIS_VUITTON, 1);
        brandProbabilityMap.put(Label.Value.LRG, 7);
        brandProbabilityMap.put(Label.Value.LTB, 1);
        brandProbabilityMap.put(Label.Value.LYLE_N_SCOTT, 1);
        brandProbabilityMap.put(Label.Value.MARC_O_POLO, 2);
        brandProbabilityMap.put(Label.Value.MAVI, 2);
        brandProbabilityMap.put(Label.Value.MAZE, 2);
        brandProbabilityMap.put(Label.Value.MAZINE, 8);
        brandProbabilityMap.put(Label.Value.MEXX, 5);
        brandProbabilityMap.put(Label.Value.MODSTROEM, 1);
        brandProbabilityMap.put(Label.Value.MORE_N_MORE, 1);
        brandProbabilityMap.put(Label.Value.MORGAN, 1);
        brandProbabilityMap.put(Label.Value.MOEVE, 1);
        brandProbabilityMap.put(Label.Value.NAF_NAF, 1);
        brandProbabilityMap.put(Label.Value.NAPAPIJRI, 3);
//		brandProbabilityMap.put(Label.Value.NEW_YORKER, 6);
        brandProbabilityMap.put(Label.Value.NIKE, 5);
        brandProbabilityMap.put(Label.Value.OAKWOOD, 1);
        brandProbabilityMap.put(Label.Value.OLYMP_LEVEL_5, 1);
        brandProbabilityMap.put(Label.Value.ONLY, 2);
        brandProbabilityMap.put(Label.Value.ONLY_N_SONS, 1);
        brandProbabilityMap.put(Label.Value.OPUS, 1);
        brandProbabilityMap.put(Label.Value.ORLEBAR_BROWN, 8);
        brandProbabilityMap.put(Label.Value.PATAGONIA, 4);
        brandProbabilityMap.put(Label.Value.PEPE, 5);
        brandProbabilityMap.put(Label.Value.PIER_ONE, 2);
//		brandProbabilityMap.put(Label.Value.PRADA, 1);
        brandProbabilityMap.put(Label.Value.PUMA, 6);
        brandProbabilityMap.put(Label.Value.QUIKSILVER, 8);
//		brandProbabilityMap.put(Label.Value.RALPH_LAUREN, 1);
        brandProbabilityMap.put(Label.Value.RAINS, 2);
//		brandProbabilityMap.put(Label.Value.REEBOK, 6);
        brandProbabilityMap.put(Label.Value.RENE_LEZARD, 1);
        brandProbabilityMap.put(Label.Value.ROSEMUNDE, 1);
        brandProbabilityMap.put(Label.Value.ROXY, 6);
        brandProbabilityMap.put(Label.Value.S_OLIVER, 5);
        brandProbabilityMap.put(Label.Value.SCHIESSER, 5);
        brandProbabilityMap.put(Label.Value.SCHOTT_NYC, 1);
        brandProbabilityMap.put(Label.Value.SCOTCH_N_SODA, 5);
        brandProbabilityMap.put(Label.Value.SEAFOLLY, 6);
        brandProbabilityMap.put(Label.Value.SELECTED_FEMME, 2);
        brandProbabilityMap.put(Label.Value.SELECTED_HOMME, 2);
        brandProbabilityMap.put(Label.Value.SEIDENSTICKER, 1);
        brandProbabilityMap.put(Label.Value.SISLEY, 2);
//		brandProbabilityMap.put(Label.Value.SPIRAL, 1);
//		brandProbabilityMap.put(Label.Value.SUPERDRY, 3);
        brandProbabilityMap.put(Label.Value.SUPERTRASH, 2);
        brandProbabilityMap.put(Label.Value.SWEET_PANTS, 5);
        brandProbabilityMap.put(Label.Value.SWING, 1);
        brandProbabilityMap.put(Label.Value.TEDDY_SMITH, 4);
        brandProbabilityMap.put(Label.Value.TIGER_OF_SWEDEN, 2);
        brandProbabilityMap.put(Label.Value.TOM_TAILOR, 4);
        brandProbabilityMap.put(Label.Value.TOMMY_HILFIGER, 5);
        brandProbabilityMap.put(Label.Value.TWINTIP, 3);
        brandProbabilityMap.put(Label.Value.URBAN_CLASSICS, 3);
        brandProbabilityMap.put(Label.Value.VANS, 9);
        brandProbabilityMap.put(Label.Value.VERO_MODA, 2);
        brandProbabilityMap.put(Label.Value.VERSACE, 1);
        brandProbabilityMap.put(Label.Value.VILA, 2);
        brandProbabilityMap.put(Label.Value.VOLCOM, 3);
        brandProbabilityMap.put(Label.Value.VOSSEN, 2);
        brandProbabilityMap.put(Label.Value.WRANGLER, 5);
        brandProbabilityMap.put(Label.Value.YOUR_TURN, 5);
        brandProbabilityMap.put(Label.Value.ZALANDO, 3);
	}

	private void buildAttributeMap() {
		this.attributeProbabilityMap = new HashMap<String, Integer>();
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.acryl), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.athletic), 6);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.baggy), 7);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.blue), 6);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.brown), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.cremeColored), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.triangle), 7);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.dark), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.emo), 1);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.tight), 6);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.yellow), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.girly), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.grey), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.green), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.light), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.lightblue), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.hoody), 7);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.classic), 1);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.curt), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.leather), 1);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.lilac), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.logo), 7);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.girl), 3);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.swatch), 6);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.navy), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.neon), 4);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.original), 6);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.pink), 3);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.plush), 1);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.retro), 3);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.romantic), 1);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.red), 4);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.ribbon), 1);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.cord), 1);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.sport), 6);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.sporty), 6);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.black), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.saying), 7);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.street), 8);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.stripes), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.used), 8);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.vintage), 3);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.white), 4);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.gold), 1);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.silver), 1);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.petrol), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.olive), 5);

	}

	private void buildMusicMap() {
		this.musicTaste = new HashMap<Music, Integer>();
		musicTaste.put(Music.ELECTRONIC, 3);
		musicTaste.put(Music.POP, 2);
		musicTaste.put(Music.ROCK, 6);
		musicTaste.put(Music.CLASSIC, 0);
		musicTaste.put(Music.JAZZ, 0);
		musicTaste.put(Music.DNB, 6);
		musicTaste.put(Music.HIP_HOP, 7);
		musicTaste.put(Music.FOLK, 3);
		musicTaste.put(Music.INDIE, 2);
	}

	private void buildJobMap() {
		this.jobs = new HashMap<Job, Integer>();
		jobs.put(Job.PUPIL, 8);
		jobs.put(Job.STUDENT, 7);
		jobs.put(Job.MANAGER, 2);
		jobs.put(Job.SALESPERSON, 3);
		jobs.put(Job.CASHIER, 3);
		jobs.put(Job.COOK, 4);
		jobs.put(Job.WAITER, 4);
		jobs.put(Job.NURSE, 3);
		jobs.put(Job.CUSTOMER_SERVICE_REPRESENTATIVE, 3);
		jobs.put(Job.CARPENTER, 2);
		jobs.put(Job.SECRETARY, 2);
		jobs.put(Job.ASSISTANT, 2);
		jobs.put(Job.LAWYER, 1);
		jobs.put(Job.PROGRAMMER, 6);
		jobs.put(Job.ATHLETE, 4);
		jobs.put(Job.RESEARCHER, 2);
        jobs.put(Job.UNEMPLOYED, 6);
		jobs.put(Job.OTHER, 0);
	}

	private void buildAgeMap() {
		this.ageRange = new HashMap<AgeRange, Integer>();
		ageRange.put(AgeRange.CHILD, 2);
		ageRange.put(AgeRange.TEENAGER, 8);
		ageRange.put(AgeRange.YOUNG_ADULT, 6);
		ageRange.put(AgeRange.ADULT, 3);
		ageRange.put(AgeRange.OLDER_ADULT, 1);
		ageRange.put(AgeRange.SENIOR, 0);
	}
}
