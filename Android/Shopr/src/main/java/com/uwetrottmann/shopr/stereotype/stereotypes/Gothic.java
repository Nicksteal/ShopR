package com.uwetrottmann.shopr.stereotype.stereotypes;

import com.uwetrottmann.shopr.R;
import com.uwetrottmann.shopr.ShoprApp;
import com.uwetrottmann.shopr.algorithm.model.Label;
import com.uwetrottmann.shopr.stereotype.user.AgeRange;
import com.uwetrottmann.shopr.stereotype.user.Job;
import com.uwetrottmann.shopr.stereotype.user.Music;

import java.util.HashMap;

/**
 * Fashion style that is related to Gothic Rock music. A Gothic person enjoys a
 * romantic style and accepts that everyone’s di↵erent. Usually has dyed black hair, wears
 * black lipstick and black clothes. The style is first and foremost known for using black as
 * the main color in contrast to pieces of red, scarlet or deep purple. Clothes are often made
 * of lather or lace.
 */
public class Gothic extends AbstractStereotype {

	public Gothic() {
		this.stereotype = Stereotype.GOTHIC;

		buildAgeMap();

		buildJobMap();

		buildMusicMap();

		buildBrandMap();

		buildAttributeMap();
	}

	private void buildBrandMap() {
		this.brandProbabilityMap = new HashMap<Label.Value, Integer>();
		brandProbabilityMap.put(Label.Value.ADIDAS, 2);
		brandProbabilityMap.put(Label.Value.ALLEGRA_K, 7);
		brandProbabilityMap.put(Label.Value.BOOM_BAP, 2);
		brandProbabilityMap.put(Label.Value.HUGO_BOSS, 1);
		brandProbabilityMap.put(Label.Value.BRAX, 1);
		brandProbabilityMap.put(Label.Value.BYE_BYE_KITTY, 9);
		brandProbabilityMap.put(Label.Value.CARHARTT, 2);
		brandProbabilityMap.put(Label.Value.CHANEL, 1);
		brandProbabilityMap.put(Label.Value.CONVERSE, 3);
		brandProbabilityMap.put(Label.Value.CUPCAKECULT, 9);
		brandProbabilityMap.put(Label.Value.DC, 1);
		brandProbabilityMap.put(Label.Value.DENIM, 2);
		brandProbabilityMap.put(Label.Value.DICKIES, 2);
		brandProbabilityMap.put(Label.Value.DIESEL, 5);
		brandProbabilityMap.put(Label.Value.C_DIOR, 1);
		brandProbabilityMap.put(Label.Value.ESPRIT, 3);
		brandProbabilityMap.put(Label.Value.ETNIES, 3);
		brandProbabilityMap.put(Label.Value.FJÄLLRÄVEN, 5);
		brandProbabilityMap.put(Label.Value.FOREVER_21, 5);
		brandProbabilityMap.put(Label.Value.G_STAR, 4);
		brandProbabilityMap.put(Label.Value.GUCCI, 1);
		brandProbabilityMap.put(Label.Value.H_N_M, 3);
		brandProbabilityMap.put(Label.Value.HRLONDON, 9);
		brandProbabilityMap.put(Label.Value.HELLBUNNY, 8);
		brandProbabilityMap.put(Label.Value.INNOCENT, 9);
		brandProbabilityMap.put(Label.Value.J_CREW, 1);
		brandProbabilityMap.put(Label.Value.LACOSTE, 1);
		brandProbabilityMap.put(Label.Value.LEVI_S, 4);
		brandProbabilityMap.put(Label.Value.LIVINGDEADSOULS, 9);
		brandProbabilityMap.put(Label.Value.LOUIS_VUITTON, 1);
		brandProbabilityMap.put(Label.Value.LRG, 2);
		brandProbabilityMap.put(Label.Value.MAZINE, 2);
		brandProbabilityMap.put(Label.Value.NEW_YORKER, 3);
		brandProbabilityMap.put(Label.Value.NIKE, 2);
		brandProbabilityMap.put(Label.Value.PEPE, 3);
		brandProbabilityMap.put(Label.Value.PRADA, 1);
		brandProbabilityMap.put(Label.Value.RALPH_LAUREN, 1);
		brandProbabilityMap.put(Label.Value.REEBOK, 2);
		brandProbabilityMap.put(Label.Value.S_OLIVER, 1);
		brandProbabilityMap.put(Label.Value.SCOTCH_N_SODA, 3);
		brandProbabilityMap.put(Label.Value.SPIRAL, 9);
		brandProbabilityMap.put(Label.Value.SUPERDRY, 4);
		brandProbabilityMap.put(Label.Value.TOM_TAILOR, 3);
		brandProbabilityMap.put(Label.Value.TOMMY_HILFIGER, 2);
		brandProbabilityMap.put(Label.Value.VANS, 2);
		brandProbabilityMap.put(Label.Value.VERSACE, 5);

	}

	private void buildAttributeMap() {
		this.attributeProbabilityMap = new HashMap<String, Integer>();
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.acryl), 1);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.athletic), 1);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.baggy), 1);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.blue), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.brown), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.cremeColored), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.triangle), 6);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.dark), 9);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.emo), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.tight), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.yellow), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.girly), 3);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.grey), 6);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.green), 4);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.light), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.lightblue), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.hoody), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.classic), 4);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.curt), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.leather), 8);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.lilac), 6);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.logo), 1);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.girl), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.swatch), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.navy), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.neon), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.original), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.pink), 1);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.plush), 1);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.retro), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.romantic), 8);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.red), 7);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.ribbon), 7);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.cord), 8);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.sport), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.sporty), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.black), 9);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.saying), 2);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.street), 1);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.stripes), 5);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.used), 1);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.vintage), 1);
		attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.white), 5);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.gold), 1);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.silver), 1);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.petrol), 2);
        attributeProbabilityMap.put(ShoprApp.getContext().getString(R.string.olive), 6);

	}

	private void buildMusicMap() {
		this.musicTaste = new HashMap<Music, Integer>();
		musicTaste.put(Music.ELECTRONIC, 1);
		musicTaste.put(Music.POP, 2);
		musicTaste.put(Music.ROCK, 7);
		musicTaste.put(Music.CLASSIC, 3);
		musicTaste.put(Music.JAZZ, 1);
		musicTaste.put(Music.DNB, 2);
		musicTaste.put(Music.HIP_HOP, 1);
		musicTaste.put(Music.FOLK, 2);
		musicTaste.put(Music.INDIE, 3);
	}

	private void buildJobMap() {
		this.jobs = new HashMap<Job, Integer>();
		jobs.put(Job.PUPIL, 7);
		jobs.put(Job.STUDENT, 7);
		jobs.put(Job.MANAGER, 0);
		jobs.put(Job.SALESPERSON, 5);
		jobs.put(Job.CASHIER, 6);
		jobs.put(Job.COOK, 4);
		jobs.put(Job.WAITER, 6);
		jobs.put(Job.NURSE, 6);
		jobs.put(Job.CUSTOMER_SERVICE_REPRESENTATIVE, 3);
		jobs.put(Job.CARPENTER, 5);
		jobs.put(Job.SECRETARY, 5);
		jobs.put(Job.ASSISTANT, 3);
		jobs.put(Job.LAWYER, 1);
		jobs.put(Job.PROGRAMMER, 7);
		jobs.put(Job.ATHLETE, 1);
		jobs.put(Job.RESEARCHER, 5);
        jobs.put(Job.UNEMPLOYED, 6);
		jobs.put(Job.OTHER, 0);
	}

	private void buildAgeMap() {
		this.ageRange = new HashMap<AgeRange, Integer>();
		ageRange.put(AgeRange.CHILD, 0);
		ageRange.put(AgeRange.TEENAGER, 7);
		ageRange.put(AgeRange.YOUNG_ADULT, 8);
		ageRange.put(AgeRange.ADULT, 6);
		ageRange.put(AgeRange.OLDER_ADULT, 4);
		ageRange.put(AgeRange.SENIOR, 1);
	}
}
