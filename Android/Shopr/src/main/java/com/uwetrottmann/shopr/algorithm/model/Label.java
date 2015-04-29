
package com.uwetrottmann.shopr.algorithm.model;

import android.util.Log;

import com.uwetrottmann.shopr.algorithm.model.Attributes.AttributeValue;

import org.jgrapht.Graphs;
import org.jgrapht.UndirectedGraph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Label extends GenericAttribute {

    public static final String ID = "label";

    public static final Map<String, Value> sAvailableBrands = new HashMap<String, Value>();

    private static UndirectedGraph<Label.Value, DefaultEdge> sSimilarValues;

    static {
        sSimilarValues = new SimpleGraph<Value, DefaultEdge>(DefaultEdge.class);

        Value[] values = Value.values();
        for (Value value : values) {
            sSimilarValues.addVertex(value);
        }

        sSimilarValues.addEdge(Value.COMMA, Value.MARC_O_POLO);
        sSimilarValues.addEdge(Value.COMMA, Value.SELECTED_FEMME);
        sSimilarValues.addEdge(Value.COMMA, Value.FILIPPA_K);
        sSimilarValues.addEdge(Value.COMMA, Value.JOOP);
        sSimilarValues.addEdge(Value.COMMA, Value.VILA);
        sSimilarValues.addEdge(Value.COMMA, Value.SELECTED_HOMME);
        sSimilarValues.addEdge(Value.LEVI_S, Value.S_OLIVER);
//        sSimilarValues.addEdge(Value.LEVI_S, Value.NEW_YORKER);
        sSimilarValues.addEdge(Value.LEVI_S, Value.ESPRIT);
        sSimilarValues.addEdge(Value.LEVI_S, Value.SCOTCH_N_SODA);
        sSimilarValues.addEdge(Value.LEVI_S, Value.G_STAR);
        sSimilarValues.addEdge(Value.LEVI_S, Value.PEPE);
//        sSimilarValues.addEdge(Value.PRADA, Value.RALPH_LAUREN);
//        sSimilarValues.addEdge(Value.PRADA, Value.LAGERFELD);
//        sSimilarValues.addEdge(Value.PRADA, Value.HUGO_BOSS);
//        sSimilarValues.addEdge(Value.PRADA, Value.LOUIS_VUITTON);
//        sSimilarValues.addEdge(Value.PRADA, Value.C_DIOR);
//        sSimilarValues.addEdge(Value.PRADA, Value.TIGER_OF_SWEDEN);
//        sSimilarValues.addEdge(Value.PRADA, Value.GUCCI);
//        sSimilarValues.addEdge(Value.PRADA, Value.VERSACE);
//        sSimilarValues.addEdge(Value.PRADA, Value.CHANEL);
//        sSimilarValues.addEdge(Value.PRADA, Value.BRAX);
//        sSimilarValues.addEdge(Value.PRADA, Value.BOSS_ORANGE);
        sSimilarValues.addEdge(Value.MARC_O_POLO, Value.COMMA);
        sSimilarValues.addEdge(Value.MARC_O_POLO, Value.PIER_ONE);
        sSimilarValues.addEdge(Value.MARC_O_POLO, Value.FILIPPA_K);
        sSimilarValues.addEdge(Value.MARC_O_POLO, Value.TIGER_OF_SWEDEN);
        sSimilarValues.addEdge(Value.MORE_N_MORE, Value.ANNA_FIELD);
        sSimilarValues.addEdge(Value.MORE_N_MORE, Value.NAF_NAF);
        sSimilarValues.addEdge(Value.EVEN_N_ODD, Value.VERO_MODA);
        sSimilarValues.addEdge(Value.ANNA_FIELD, Value.MORE_N_MORE);
        sSimilarValues.addEdge(Value.ANNA_FIELD, Value.RAINS);
//        sSimilarValues.addEdge(Value.INNOCENT, Value.LIVINGDEADSOULS);
//        sSimilarValues.addEdge(Value.INNOCENT, Value.HRLONDON);
//        sSimilarValues.addEdge(Value.INNOCENT, Value.HELLBUNNY);
//        sSimilarValues.addEdge(Value.INNOCENT, Value.SPIRAL);
//        sSimilarValues.addEdge(Value.RALPH_LAUREN, Value.PRADA);
//        sSimilarValues.addEdge(Value.RALPH_LAUREN, Value.J_CREW);
//        sSimilarValues.addEdge(Value.RALPH_LAUREN, Value.HUGO_BOSS);
//        sSimilarValues.addEdge(Value.RALPH_LAUREN, Value.LOUIS_VUITTON);
//        sSimilarValues.addEdge(Value.RALPH_LAUREN, Value.C_DIOR);
//        sSimilarValues.addEdge(Value.RALPH_LAUREN, Value.OLYMP_LEVEL_5);
//        sSimilarValues.addEdge(Value.RALPH_LAUREN, Value.GUCCI);
//        sSimilarValues.addEdge(Value.RALPH_LAUREN, Value.CHANEL);
//        sSimilarValues.addEdge(Value.RALPH_LAUREN, Value.LACOSTE);
//        sSimilarValues.addEdge(Value.RALPH_LAUREN, Value.BOSS_ORANGE);
//        sSimilarValues.addEdge(Value.J_CREW, Value.RALPH_LAUREN);
//        sSimilarValues.addEdge(Value.J_CREW, Value.LACOSTE);
//        sSimilarValues.addEdge(Value.J_CREW, Value.BRAX);
        sSimilarValues.addEdge(Value.DOCKERS, Value.NAF_NAF);
        sSimilarValues.addEdge(Value.DOCKERS, Value.VOSSEN);
        sSimilarValues.addEdge(Value.MAVI, Value.KAFFE);
        sSimilarValues.addEdge(Value.JACK_N_JONES, Value.URBAN_CLASSICS);
        sSimilarValues.addEdge(Value.OAKWOOD, Value.NAF_NAF);
        sSimilarValues.addEdge(Value.OAKWOOD, Value.ROSEMUNDE);
//        sSimilarValues.addEdge(Value.LAGERFELD, Value.PRADA);
//        sSimilarValues.addEdge(Value.LAGERFELD, Value.LOUIS_VUITTON);
//        sSimilarValues.addEdge(Value.LAGERFELD, Value.C_DIOR);
        sSimilarValues.addEdge(Value.LAGERFELD, Value.SELECTED_HOMME);
        sSimilarValues.addEdge(Value.LAGERFELD, Value.VERSACE);
        sSimilarValues.addEdge(Value.LAGERFELD, Value.SWING);
//        sSimilarValues.addEdge(Value.NIKE, Value.REEBOK);
        sSimilarValues.addEdge(Value.NIKE, Value.PUMA);
        sSimilarValues.addEdge(Value.NIKE, Value.ADIDAS);
        sSimilarValues.addEdge(Value.KAFFE, Value.MAVI);
        sSimilarValues.addEdge(Value.KAFFE, Value.NAF_NAF);
        sSimilarValues.addEdge(Value.PIER_ONE, Value.MARC_O_POLO);
        sSimilarValues.addEdge(Value.PIER_ONE, Value.SELECTED_FEMME);
        sSimilarValues.addEdge(Value.PIER_ONE, Value.TIGER_OF_SWEDEN);
        sSimilarValues.addEdge(Value.PIER_ONE, Value.SELECTED_HOMME);
        sSimilarValues.addEdge(Value.PIER_ONE, Value.SWING);
//        sSimilarValues.addEdge(Value.BOOM_BAP, Value.VOLCOM);
//        sSimilarValues.addEdge(Value.H_N_M, Value.CALVIN_KLEIN);
//        sSimilarValues.addEdge(Value.H_N_M, Value.SUPERDRY);
        sSimilarValues.addEdge(Value.BENETTON, Value.VERO_MODA);
//        sSimilarValues.addEdge(Value.LIVINGDEADSOULS, Value.INNOCENT);
//        sSimilarValues.addEdge(Value.LIVINGDEADSOULS, Value.CUPCAKECULT);
//        sSimilarValues.addEdge(Value.LIVINGDEADSOULS, Value.HRLONDON);
//        sSimilarValues.addEdge(Value.LIVINGDEADSOULS, Value.HELLBUNNY);
//        sSimilarValues.addEdge(Value.LIVINGDEADSOULS, Value.SPIRAL);
        sSimilarValues.addEdge(Value.TOMMY_HILFIGER, Value.TOM_TAILOR);
        sSimilarValues.addEdge(Value.TOMMY_HILFIGER, Value.CALVIN_KLEIN);
//        sSimilarValues.addEdge(Value.HUGO_BOSS, Value.PRADA);
//        sSimilarValues.addEdge(Value.HUGO_BOSS, Value.RALPH_LAUREN);
//        sSimilarValues.addEdge(Value.HUGO_BOSS, Value.LOUIS_VUITTON);
//        sSimilarValues.addEdge(Value.HUGO_BOSS, Value.C_DIOR);
//        sSimilarValues.addEdge(Value.HUGO_BOSS, Value.GUCCI);
        sSimilarValues.addEdge(Value.HUGO_BOSS, Value.VERSACE);
//        sSimilarValues.addEdge(Value.HUGO_BOSS, Value.CHANEL);
        sSimilarValues.addEdge(Value.HUGO_BOSS, Value.LACOSTE);
//        sSimilarValues.addEdge(Value.HUGO_BOSS, Value.BRAX);
        sSimilarValues.addEdge(Value.HUGO_BOSS, Value.BOSS_ORANGE);
        sSimilarValues.addEdge(Value.SELECTED_FEMME, Value.COMMA);
        sSimilarValues.addEdge(Value.SELECTED_FEMME, Value.PIER_ONE);
        sSimilarValues.addEdge(Value.SELECTED_FEMME, Value.TIGER_OF_SWEDEN);
        sSimilarValues.addEdge(Value.SELECTED_FEMME, Value.SELECTED_HOMME);
        sSimilarValues.addEdge(Value.SELECTED_FEMME, Value.SWING);
        sSimilarValues.addEdge(Value.DC, Value.DICKIES);
//        sSimilarValues.addEdge(Value.DC, Value.ETNIES);
        sSimilarValues.addEdge(Value.DC, Value.MAZINE);
//        sSimilarValues.addEdge(Value.LOUIS_VUITTON, Value.PRADA);
//        sSimilarValues.addEdge(Value.LOUIS_VUITTON, Value.RALPH_LAUREN);
//        sSimilarValues.addEdge(Value.LOUIS_VUITTON, Value.LAGERFELD);
//        sSimilarValues.addEdge(Value.LOUIS_VUITTON, Value.HUGO_BOSS);
//        sSimilarValues.addEdge(Value.LOUIS_VUITTON, Value.C_DIOR);
//        sSimilarValues.addEdge(Value.LOUIS_VUITTON, Value.TIGER_OF_SWEDEN);
//        sSimilarValues.addEdge(Value.LOUIS_VUITTON, Value.GUCCI);
//        sSimilarValues.addEdge(Value.LOUIS_VUITTON, Value.VERSACE);
//        sSimilarValues.addEdge(Value.LOUIS_VUITTON, Value.CHANEL);
//        sSimilarValues.addEdge(Value.LOUIS_VUITTON, Value.BRAX);
//        sSimilarValues.addEdge(Value.LOUIS_VUITTON, Value.BOSS_ORANGE);
        sSimilarValues.addEdge(Value.S_OLIVER, Value.LEVI_S);
        sSimilarValues.addEdge(Value.SEIDENSTICKER, Value.RENE_LEZARD);
        sSimilarValues.addEdge(Value.OPUS, Value.VILA);
//        sSimilarValues.addEdge(Value.C_DIOR, Value.PRADA);
//        sSimilarValues.addEdge(Value.C_DIOR, Value.RALPH_LAUREN);
//        sSimilarValues.addEdge(Value.C_DIOR, Value.LAGERFELD);
//        sSimilarValues.addEdge(Value.C_DIOR, Value.HUGO_BOSS);
//        sSimilarValues.addEdge(Value.C_DIOR, Value.LOUIS_VUITTON);
//        sSimilarValues.addEdge(Value.C_DIOR, Value.TIGER_OF_SWEDEN);
//        sSimilarValues.addEdge(Value.C_DIOR, Value.GUCCI);
//        sSimilarValues.addEdge(Value.C_DIOR, Value.VERSACE);
//        sSimilarValues.addEdge(Value.C_DIOR, Value.SWING);
//        sSimilarValues.addEdge(Value.C_DIOR, Value.CHANEL);
        sSimilarValues.addEdge(Value.WRANGLER, Value.BEN_SHERMAN);
        sSimilarValues.addEdge(Value.ROXY, Value.BILLABONG);
        sSimilarValues.addEdge(Value.NAF_NAF, Value.MORE_N_MORE);
        sSimilarValues.addEdge(Value.NAF_NAF, Value.DOCKERS);
        sSimilarValues.addEdge(Value.NAF_NAF, Value.OAKWOOD);
        sSimilarValues.addEdge(Value.NAF_NAF, Value.KAFFE);
        sSimilarValues.addEdge(Value.NAF_NAF, Value.VILA);
        sSimilarValues.addEdge(Value.NAF_NAF, Value.ROSEMUNDE);
        sSimilarValues.addEdge(Value.FILIPPA_K, Value.COMMA);
        sSimilarValues.addEdge(Value.FILIPPA_K, Value.MARC_O_POLO);
        sSimilarValues.addEdge(Value.FILIPPA_K, Value.SWING);
//        sSimilarValues.addEdge(Value.CUPCAKECULT, Value.LIVINGDEADSOULS);
//        sSimilarValues.addEdge(Value.CUPCAKECULT, Value.HRLONDON);
//        sSimilarValues.addEdge(Value.CUPCAKECULT, Value.SPIRAL);
//        sSimilarValues.addEdge(Value.CUPCAKECULT, Value.BYE_BYE_KITTY);
//        sSimilarValues.addEdge(Value.FJÄLLRÄVEN, Value.DIESEL);
        sSimilarValues.addEdge(Value.BEN_SHERMAN, Value.WRANGLER);
//        sSimilarValues.addEdge(Value.HRLONDON, Value.INNOCENT);
//        sSimilarValues.addEdge(Value.HRLONDON, Value.LIVINGDEADSOULS);
//        sSimilarValues.addEdge(Value.HRLONDON, Value.CUPCAKECULT);
//        sSimilarValues.addEdge(Value.HRLONDON, Value.HELLBUNNY);
//        sSimilarValues.addEdge(Value.HRLONDON, Value.SPIRAL);
//        sSimilarValues.addEdge(Value.HRLONDON, Value.BYE_BYE_KITTY);
        sSimilarValues.addEdge(Value.RENE_LEZARD, Value.SEIDENSTICKER);
        sSimilarValues.addEdge(Value.RENE_LEZARD, Value.SWING);
//        sSimilarValues.addEdge(Value.NEW_YORKER, Value.LEVI_S);
//        sSimilarValues.addEdge(Value.NEW_YORKER, Value.ESPRIT);
//        sSimilarValues.addEdge(Value.NEW_YORKER, Value.SCOTCH_N_SODA);
//        sSimilarValues.addEdge(Value.NEW_YORKER, Value.PEPE);
        sSimilarValues.addEdge(Value.JOOP, Value.COMMA);
        sSimilarValues.addEdge(Value.JOOP, Value.TIGER_OF_SWEDEN);
//        sSimilarValues.addEdge(Value.JOOP, Value.CHANEL);
        sSimilarValues.addEdge(Value.CONVERSE, Value.ORLEBAR_BROWN);
//        sSimilarValues.addEdge(Value.CONVERSE, Value.ETNIES);
//        sSimilarValues.addEdge(Value.HELLBUNNY, Value.INNOCENT);
//        sSimilarValues.addEdge(Value.HELLBUNNY, Value.LIVINGDEADSOULS);
//        sSimilarValues.addEdge(Value.HELLBUNNY, Value.HRLONDON);
//        sSimilarValues.addEdge(Value.HELLBUNNY, Value.SPIRAL);
        sSimilarValues.addEdge(Value.TOM_TAILOR, Value.TOMMY_HILFIGER);
        sSimilarValues.addEdge(Value.TOM_TAILOR, Value.CALVIN_KLEIN);
        sSimilarValues.addEdge(Value.TOM_TAILOR, Value.ZALANDO);
//        sSimilarValues.addEdge(Value.DIESEL, Value.FJÄLLRÄVEN);
//        sSimilarValues.addEdge(Value.REEBOK, Value.NIKE);
//        sSimilarValues.addEdge(Value.REEBOK, Value.PUMA);
//        sSimilarValues.addEdge(Value.REEBOK, Value.ADIDAS);
        sSimilarValues.addEdge(Value.CAMEL_ACTIVE, Value.MORGAN);
//        sSimilarValues.addEdge(Value.SPIRAL, Value.INNOCENT);
//        sSimilarValues.addEdge(Value.SPIRAL, Value.LIVINGDEADSOULS);
//        sSimilarValues.addEdge(Value.SPIRAL, Value.CUPCAKECULT);
//        sSimilarValues.addEdge(Value.SPIRAL, Value.HRLONDON);
//        sSimilarValues.addEdge(Value.SPIRAL, Value.HELLBUNNY);
//        sSimilarValues.addEdge(Value.SPIRAL, Value.BYE_BYE_KITTY);
        sSimilarValues.addEdge(Value.DICKIES, Value.DC);
        sSimilarValues.addEdge(Value.DICKIES, Value.TWINTIP);
//        sSimilarValues.addEdge(Value.DICKIES, Value.ETNIES);
        sSimilarValues.addEdge(Value.DICKIES, Value.LRG);
        sSimilarValues.addEdge(Value.DICKIES, Value.MAZINE);
        sSimilarValues.addEdge(Value.ESPRIT, Value.LEVI_S);
//        sSimilarValues.addEdge(Value.ESPRIT, Value.NEW_YORKER);
        sSimilarValues.addEdge(Value.ESPRIT, Value.SCOTCH_N_SODA);
        sSimilarValues.addEdge(Value.ESPRIT, Value.G_STAR);
        sSimilarValues.addEdge(Value.ESPRIT, Value.PEPE);
//        sSimilarValues.addEdge(Value.OLYMP_LEVEL_5, Value.RALPH_LAUREN);
        sSimilarValues.addEdge(Value.OLYMP_LEVEL_5, Value.BOSS_ORANGE);
        sSimilarValues.addEdge(Value.TWINTIP, Value.DICKIES);
//        sSimilarValues.addEdge(Value.TIGER_OF_SWEDEN, Value.PRADA);
        sSimilarValues.addEdge(Value.TIGER_OF_SWEDEN, Value.MARC_O_POLO);
        sSimilarValues.addEdge(Value.TIGER_OF_SWEDEN, Value.PIER_ONE);
        sSimilarValues.addEdge(Value.TIGER_OF_SWEDEN, Value.SELECTED_FEMME);
//        sSimilarValues.addEdge(Value.TIGER_OF_SWEDEN, Value.LOUIS_VUITTON);
//        sSimilarValues.addEdge(Value.TIGER_OF_SWEDEN, Value.C_DIOR);
        sSimilarValues.addEdge(Value.TIGER_OF_SWEDEN, Value.JOOP);
//        sSimilarValues.addEdge(Value.TIGER_OF_SWEDEN, Value.GUCCI);
        sSimilarValues.addEdge(Value.TIGER_OF_SWEDEN, Value.SELECTED_HOMME);
        sSimilarValues.addEdge(Value.TIGER_OF_SWEDEN, Value.SWING);
//        sSimilarValues.addEdge(Value.TIGER_OF_SWEDEN, Value.CHANEL);
        sSimilarValues.addEdge(Value.SCOTCH_N_SODA, Value.LEVI_S);
//        sSimilarValues.addEdge(Value.SCOTCH_N_SODA, Value.NEW_YORKER);
        sSimilarValues.addEdge(Value.SCOTCH_N_SODA, Value.ESPRIT);
        sSimilarValues.addEdge(Value.SCOTCH_N_SODA, Value.G_STAR);
        sSimilarValues.addEdge(Value.SCOTCH_N_SODA, Value.PEPE);
//        sSimilarValues.addEdge(Value.CALVIN_KLEIN, Value.H_N_M);
        sSimilarValues.addEdge(Value.CALVIN_KLEIN, Value.TOMMY_HILFIGER);
        sSimilarValues.addEdge(Value.CALVIN_KLEIN, Value.TOM_TAILOR);
        sSimilarValues.addEdge(Value.CALVIN_KLEIN, Value.ZALANDO);
        sSimilarValues.addEdge(Value.VILA, Value.COMMA);
        sSimilarValues.addEdge(Value.VILA, Value.OPUS);
        sSimilarValues.addEdge(Value.VILA, Value.NAF_NAF);
        sSimilarValues.addEdge(Value.VILA, Value.FORVERT);
        sSimilarValues.addEdge(Value.VOSSEN, Value.DOCKERS);
//        sSimilarValues.addEdge(Value.GUCCI, Value.PRADA);
//        sSimilarValues.addEdge(Value.GUCCI, Value.RALPH_LAUREN);
//        sSimilarValues.addEdge(Value.GUCCI, Value.HUGO_BOSS);
//        sSimilarValues.addEdge(Value.GUCCI, Value.LOUIS_VUITTON);
//        sSimilarValues.addEdge(Value.GUCCI, Value.C_DIOR);
//        sSimilarValues.addEdge(Value.GUCCI, Value.TIGER_OF_SWEDEN);
//        sSimilarValues.addEdge(Value.GUCCI, Value.VERSACE);
//        sSimilarValues.addEdge(Value.GUCCI, Value.CHANEL);
        sSimilarValues.addEdge(Value.ORLEBAR_BROWN, Value.CONVERSE);
        sSimilarValues.addEdge(Value.ORLEBAR_BROWN, Value.MAZINE);
        sSimilarValues.addEdge(Value.G_STAR, Value.LEVI_S);
        sSimilarValues.addEdge(Value.G_STAR, Value.ESPRIT);
        sSimilarValues.addEdge(Value.G_STAR, Value.SCOTCH_N_SODA);
        sSimilarValues.addEdge(Value.G_STAR, Value.PEPE);
        sSimilarValues.addEdge(Value.SELECTED_HOMME, Value.COMMA);
        sSimilarValues.addEdge(Value.SELECTED_HOMME, Value.LAGERFELD);
        sSimilarValues.addEdge(Value.SELECTED_HOMME, Value.PIER_ONE);
        sSimilarValues.addEdge(Value.SELECTED_HOMME, Value.SELECTED_FEMME);
        sSimilarValues.addEdge(Value.SELECTED_HOMME, Value.TIGER_OF_SWEDEN);
        sSimilarValues.addEdge(Value.SELECTED_HOMME, Value.SWING);
        sSimilarValues.addEdge(Value.SELECTED_HOMME, Value.ROSEMUNDE);
//        sSimilarValues.addEdge(Value.BYE_BYE_KITTY, Value.CUPCAKECULT);
//        sSimilarValues.addEdge(Value.BYE_BYE_KITTY, Value.HRLONDON);
//        sSimilarValues.addEdge(Value.BYE_BYE_KITTY, Value.SPIRAL);
//        sSimilarValues.addEdge(Value.VANS, Value.ETNIES);
        sSimilarValues.addEdge(Value.VANS, Value.CARHARTT);
//        sSimilarValues.addEdge(Value.ETNIES, Value.DC);
//        sSimilarValues.addEdge(Value.ETNIES, Value.CONVERSE);
//        sSimilarValues.addEdge(Value.ETNIES, Value.DICKIES);
//        sSimilarValues.addEdge(Value.ETNIES, Value.VANS);
//        sSimilarValues.addEdge(Value.ETNIES, Value.MAZINE);
//        sSimilarValues.addEdge(Value.VERSACE, Value.PRADA);
        sSimilarValues.addEdge(Value.VERSACE, Value.LAGERFELD);
        sSimilarValues.addEdge(Value.VERSACE, Value.HUGO_BOSS);
//        sSimilarValues.addEdge(Value.VERSACE, Value.LOUIS_VUITTON);
//        sSimilarValues.addEdge(Value.VERSACE, Value.C_DIOR);
//        sSimilarValues.addEdge(Value.VERSACE, Value.GUCCI);
//        sSimilarValues.addEdge(Value.VERSACE, Value.CHANEL);
        sSimilarValues.addEdge(Value.CARHARTT, Value.VANS);
        sSimilarValues.addEdge(Value.URBAN_CLASSICS, Value.JACK_N_JONES);
//        sSimilarValues.addEdge(Value.SUPERDRY, Value.H_N_M);
        sSimilarValues.addEdge(Value.LRG, Value.DICKIES);
        sSimilarValues.addEdge(Value.LRG, Value.MAZINE);
        sSimilarValues.addEdge(Value.MAZINE, Value.DC);
        sSimilarValues.addEdge(Value.MAZINE, Value.DICKIES);
        sSimilarValues.addEdge(Value.MAZINE, Value.ORLEBAR_BROWN);
//        sSimilarValues.addEdge(Value.MAZINE, Value.ETNIES);
        sSimilarValues.addEdge(Value.MAZINE, Value.LRG);
        sSimilarValues.addEdge(Value.RAINS, Value.ANNA_FIELD);
        sSimilarValues.addEdge(Value.SWING, Value.LAGERFELD);
        sSimilarValues.addEdge(Value.SWING, Value.PIER_ONE);
        sSimilarValues.addEdge(Value.SWING, Value.SELECTED_FEMME);
//        sSimilarValues.addEdge(Value.SWING, Value.C_DIOR);
        sSimilarValues.addEdge(Value.SWING, Value.FILIPPA_K);
        sSimilarValues.addEdge(Value.SWING, Value.RENE_LEZARD);
        sSimilarValues.addEdge(Value.SWING, Value.TIGER_OF_SWEDEN);
        sSimilarValues.addEdge(Value.SWING, Value.SELECTED_HOMME);
        sSimilarValues.addEdge(Value.SWING, Value.ROSEMUNDE);
        sSimilarValues.addEdge(Value.MORGAN, Value.CAMEL_ACTIVE);
        sSimilarValues.addEdge(Value.MORGAN, Value.ROSEMUNDE);
        sSimilarValues.addEdge(Value.BILLABONG, Value.ROXY);
        sSimilarValues.addEdge(Value.PUMA, Value.NIKE);
//        sSimilarValues.addEdge(Value.PUMA, Value.REEBOK);
        sSimilarValues.addEdge(Value.PUMA, Value.ADIDAS);
//        sSimilarValues.addEdge(Value.CHANEL, Value.PRADA);
//        sSimilarValues.addEdge(Value.CHANEL, Value.RALPH_LAUREN);
//        sSimilarValues.addEdge(Value.CHANEL, Value.HUGO_BOSS);
//        sSimilarValues.addEdge(Value.CHANEL, Value.LOUIS_VUITTON);
//        sSimilarValues.addEdge(Value.CHANEL, Value.C_DIOR);
//        sSimilarValues.addEdge(Value.CHANEL, Value.JOOP);
//        sSimilarValues.addEdge(Value.CHANEL, Value.TIGER_OF_SWEDEN);
//        sSimilarValues.addEdge(Value.CHANEL, Value.GUCCI);
//        sSimilarValues.addEdge(Value.CHANEL, Value.VERSACE);
//        sSimilarValues.addEdge(Value.CHANEL, Value.LACOSTE);
        sSimilarValues.addEdge(Value.VERO_MODA, Value.EVEN_N_ODD);
        sSimilarValues.addEdge(Value.VERO_MODA, Value.BENETTON);
//        sSimilarValues.addEdge(Value.LACOSTE, Value.RALPH_LAUREN);
//        sSimilarValues.addEdge(Value.LACOSTE, Value.J_CREW);
        sSimilarValues.addEdge(Value.LACOSTE, Value.HUGO_BOSS);
//        sSimilarValues.addEdge(Value.LACOSTE, Value.CHANEL);
//        sSimilarValues.addEdge(Value.LACOSTE, Value.BRAX);
        sSimilarValues.addEdge(Value.LACOSTE, Value.BOSS_ORANGE);
//        sSimilarValues.addEdge(Value.VOLCOM, Value.BOOM_BAP);
        sSimilarValues.addEdge(Value.FORVERT, Value.VILA);
//        sSimilarValues.addEdge(Value.BRAX, Value.PRADA);
//        sSimilarValues.addEdge(Value.BRAX, Value.J_CREW);
//        sSimilarValues.addEdge(Value.BRAX, Value.HUGO_BOSS);
//        sSimilarValues.addEdge(Value.BRAX, Value.LOUIS_VUITTON);
//        sSimilarValues.addEdge(Value.BRAX, Value.LACOSTE);
//        sSimilarValues.addEdge(Value.BRAX, Value.BOSS_ORANGE);
    }


    public enum Value implements Attributes.AttributeValue {
        //        A0039_ITALY("0039 Italy"),
        A2_LOVE_TONY_COHEN("2 Love Tony Cohen"),
        A313("313"),
        A55_DSL("55 DSL"),
        A7_FOR_ALL_MANKIND("7 for all mankind"),
        AAIKO("Aaiko"),
        ADD ("add"),
        ADIDAS("Adidas"),
        AG_ADRIANO_GOLDSCHMIED("AG Adriano Goldschmied"),
        //        ALLEGRA_K("Allegra K"),
        ALPHA_INDUSTRIES("Alpha Industries"),
        ALYSI("Alysi"),
        AMERICAN_APPAREL("American Apparel"),
        AMERICAN_COLLEGE("American College"),
        AMERICAN_VINTAGE("American Vintage"),
        ANA_ALCAZAR("Ana Alcazar"),
        ANDREA_N_RENATO("Andrea & Renato"),
        ANERKJENDT("Anerkjendt"),
        ANNA_FIELD("Anna Field"),
        ANNA_SCOTT("Anna Scott"),
        ANTONY_MORATO("Antony Morato"),
        APRICO("aprico"),
        APRIL_MAY("April May"),
        ARMOR_LUX("Armor lux"),
        ARMY_OF_ME("Army of Me"),
        ATELIER_GARDEUR("Atelier Gardeur"),
        BAMBAM("BamBam"),
        BANANA_MOON("Banana Moon"),
        BCBGENERATION("BCBGeneration"),
        BEACH_PANTIES("Beach Panties"),
        BELLFIELD("Bellfield"),
        //        BELLYBUTTON("bellybutton"),
        BEN_SHERMAN("Ben Sherman"),
        BENCH("Bench"),
        BENETTON("Benetton"),
        BEST_MOUNTAIN("Best Mountain"),
        BIK_BOK("Bik Bok"),
        BIKINI_BAR("Bikini Bar"),
        BILLABONG("Billabong"),
        BITCHING_N_JUNKFOOD("Bitching & Junkfood"),
        BJOERN_BORG("Björn Borg"),
        BOOB_DESIGN("Boob Design"),
        //        BOOM_BAP("Boom Bap"),
        BOSS_ORANGE("BOSS Orange"),
        BOXEUR_DES_RUES("Boxeur Des Rues"),
        BP_STUDIO("BP Studio"),
        //        BRAX("Brax"),
        BREAD_N_BOXERS("Bread & Boxers"),
        BRIGITTE_BARDOT("Brigitte Bardot"),
        BRIXTOL("Brixtol"),
        BROOKLYNS_OWN_BY_ROCAWEAR("Brooklyn's Own by Rocawear"),
        BROOKS_BROTHERS("Brooks Brothers"),
        BROSBI("Brosbi"),
        BRUNOTTI("Brunotti"),
        BRUUNS_BAZAAR("Bruuns Bazaar"),
        BUFFALO("Buffalo"),
        BUGATTI("Bugatti"),
        BURTON("Burton"),
        BYBLOS("Byblos"),
        //        BYE_BYE_KITTY("Bye bye Kitty"),
//        C_DIOR("C. Dior"),
        CARHARTT("Carhartt"),
        CALANDO("CALANDO"),
        CALVIN_KLEIN("Calvin Klein"),
        CAMEL_ACTIVE("camel active"),
        CANADIAN_CLASSICS("Canadian Classics"),
        CECEBA("Ceceba"),
        CELIO("CELIO"),
        CENTZS("CENTŽS"),
        CENTS("CENT´S"),
        CHAMPION("Champion"),
        //        CHANEL("Chanel"),
        CHEAP_MONDAY("Cheap Monday"),
        CHEVIGNON("Chevignon"),
        CHIEMSEE("Chiemsee"),
        CHRISTOFF("Christoff"),
        CIGNO_NERO("Cigno Nero"),
        CINQUE("Cinque"),
        CITIZENS_OF_HUMANITY("Citizens of Humanity"),
        CLOSET("Closet"),
        CMP_F_LLI_CAMPAGNOLO("CMP F.lli Campagnolo"),
        CO("Co"),
        COAST("Coast"),
        COLUMBIA("Columbia"),
        COMMA("comma,"),
        CONVERSE("Converse"),
        CREAM("Cream"),
        CROSS_JEANSWEAR("Cross Jeanswear"),
        //        CUPCAKECULT("Cupcakecult"),
        CRAGHOPPERS("Craghoppers"),
        CRIMINAL_DAMAGE("Criminal Damage"),
        CULTURE("Culture"),
        D_GNAK("D.GNAK"),
        DAGMAR("Dagmar"),
        //        DALE_OF_NORWAY("Dale of Norway"),
        DANIEL_HECHTER("Daniel Hechter"),
        DANTE6("Dante6"),
        DC("DC"),
        //        DENIM("Denim"),
        DEPT("DEPT"),
        DERBE("Derbe"),
        DEREK_LAM_10_CROSBY("Derek Lam 10 Crosby"),
        DESIGUAL("Desigual"),
        DESIRES("Desires"),
        DICKIES("Dickies"),
        DIESEL("Diesel"),
        DIMENSIONE_DANZA("Dimensione Danza"),
        DKNY_INTIMATES("DKNY Intimates"),
        DOCKERS("DOCKERS"),
        DOROTENNIS("DOROTENNIS"),
        DREIMASTER("Dreimaster"),
        DRY_LAKE("Dry Lake"),
        DUCA_DEL_COSMA("Duca Del Cosma"),
        ELEVEN_PARIS("Eleven Paris"),
        ELEMENT("Element"),
        ELISABETTA_FRANCHI("Elisabetta Franchi"),
        ELVINE("Elvine"),
        EMILY_VAN_DEN_BERGH("Emily van den Bergh"),
        EMOI_EN_PLUS("Emoi en Plus"),
        ESCADA("Escada"),
        ESPRIT("Esprit"),
        //        ESSENTIEL_ANTWERP("Essentiel Antwerp"),
        ETERNA("Eterna"),
        //        ETNIES("Etnies"),
        EVEN_N_ODD("Even&Odd"),
        EVISU("Evisu"),
        EXPRESSO("Expresso"),
        EZEKIEL("Ezekiel"),
        FAME_ON_YOU_PARIS("FAME ON YOU PARIS"),
        FARAH_VINTAGE("Farah Vintage"),
        FEVER_LONDON("Fever London"),
        FILIPPA_K("Filippa K"),
        FIVEUNITS("Fiveunits"),
        FIRETRAP("Firetrap"),
        //        FJÄLLRÄVEN("Fjällräven"),
        FLOWERS_FOR_FRIENDS("flowers for friends"),
        //        FOREVER_21("Forever 21"),
        FORVERT("Forvert"),
        FQ1924("FQ1924"),
        FRAAS("Fraas"),
        FRACOMINA("Fracomina"),
        FRANCIS_LEON("Francis Leon"),
        //        FRANKIE_GARAGE("Frankie Garage"),
        FRANKLIN_N_MARSHALL("Franklin & Marshall"),
        FREAKY_NATION("Freaky Nation"),
        FREE_PEOPLE("Free People"),
        FREEMAN_T_PORTER("Freeman T. Porter"),
        FRENCH_CONNECTION("French Connection"),
        FRIEDA_N_FREDDIES("Frieda & Freddies"),
        //        FROCK_AND_FRILL("Frock and Frill"),
        G_STAR("G-Star"),
        GAASTRA("Gaastra"),
        GANT("Gant"),
        GAS("GAS"),
        GAUDI("Gaudi"),
        GERRY_WEBER("Gerry Weber"),
        GESTUZ("Gestuz"),
        GIPSY("Gipsy"),
        GLAMOROUS("Glamorous"),
        GLOBE("Globe"),
        GLOVERALL("Gloverall"),
        GOOSECRAFT("Goosecraft"),
        //        GORE_RUNNING_WEAR("Gore Running Wear"),
        GSUS_SINDUSTRIES("Gsus sindustries"),
        //        GUCCI("Gucci"),
        GUESS("Guess"),
        GWYNEDDS("Gwynedds"),
        //        H_N_M("H & M"),
        HAGLOEFS("Haglöfs"),
        HAMAKI_HO("Hamaki-Ho"),
        HANRO("Hanro"),
        HARDY_AMIES("Hardy Amies"),
        HARRINGTON("HARRINGTON"),
        //        HELLBUNNY("Hellbunny"),
        HELLY_HANSEN("Helly Hansen"),
        HETREGO("Hetregó"),
        HOM("HOM"),
        //        HOODLAMB("Hoodlamb"),
//        HRLONDON("Hrlondon"),
        HUGO_BOSS("Hugo Boss"),
        HUMAN_SCALES("Human Scales"),
        HURLEY("Hurley"),
        HYPE("Hype"),
        ICEBERG("Iceberg"),
        ICEPEAK("Icepeak"),
        ICHI("ICHI"),
        IKKS("IKKS"),
        INDI_N_COLD("Indi & Cold"),
        //        INNOCENT("Innocent"),
        INWEAR("InWear"),
        IVKO("Ivko"),
        //        J_CREW("J Crew"),
        J_LINDEBERG("J.LINDEBERG"),
        JACK_WOLFSKIN("Jack Wolfskin"),
        JACK_N_JONES("Jack & Jones"),
        JAPAN_RAGS("JAPAN RAGS"),
        JEFF("Jeff"),
        JOCKEY("Jockey"),
        JOFAMA("Jofama"),
        JOHN_VARVATOS_STAR_USA("John Varvatos Star U.S.A."),
        JOOP("JOOP!"),
        JUNAROSE("Junarose"),
        JUST_CAVALLI("Just Cavalli"),
        JUST_FEMALE("JUST FEMALE"),
        K_WAY("K-Way"),
        K1X("K1X"),
        KAFFE("Kaffe"),
        KALA("Kala"),
        KAPORAL("Kaporal"),
        KARL_KANI("Karl Kani"),
        KHUJO("Khujo"),
        KILIWATCH("Kiliwatch"),
        KILIAN_KERNER_SENSES("Kilian Kerner Senses"),
        KING_LOUIE("King Louie"),
        KIOMI("KIOMI"),
        //        KIWI_SAINT_TROPEZ("Kiwi Saint Tropez"),
        KNOWLEDGE_COTTON_APPAREL("Knowledge Cotton Apparel"),
        KOOKAI("Kookai"),
        KORINTAGE_BY_SERGE_PARIENTE("Korintage by Serge Pariente"),
        KRÜGER_DIRNDL("Krüger Dirndl"),
        LA_CITY("LA CITY"),
        LACOSTE("Lacoste"),
        LAGERFELD("LAGERFELD"),
        LAONA("Laona"),
        LASCANA("LASCANA"),
        LAUREL("Laurel"),
        LE_COQ_SPORTIF("le coq sportif"),
        LE_TEMPS_DES_CERISES("Le Temps Des Cerises"),
        LEE("Lee"),
        LES_ECLAIRES_BORN_IN_FRANCE("Les Eclaires Born in France"),
        LEVI_S("Levi's"),
        LIEBESKIND("Liebeskind"),
        LIGHTNING_BOLT("Lightning Bolt"),
        LINGADORE("LingaDore"),
        LIPSY("Lipsy"),
        LIST("List"),
        LITTLE_MARCEL("Little Marcel"),
        LITTLE_MISTRESS("Little Mistress"),
        LITTLE_WHITE_LIES("Little White Lies"),
        LIU_JO_JEANS("Liu Jo Jeans"),
        LIVIA("Livia"),
        //        LIVINGDEADSOULS("Livingdeadsouls"),
        LJUNG("Ljung"),
        LK_BENNETT("LK Bennett"),
        LOGOSHIRT("LOGOSHIRT"),
        LOREAK_MENDIAN("Loreak Mendian"),
        LOUCHE("Louche"),
        //        LOUIS_VUITTON("Louis Vuitton"),
        LRG("LRG"),
        LTB("LTB"),
        LYLE_N_SCOTT("Lyle & Scott"),
        MADS_NORGAARD("Mads Nørgaard"),
        MAKIA("Makia"),
        //        MAMA_LICIOUS("Mama Licious"),
        MANGANO("Mangano"),
        MARC_O_POLO("Marc O'Polo"),
        MARCIANO_GUESS("MARCIANO GUESS"),
        MARKUS_LUPFER("Markus Lupfer"),
        MARINEPOOL("Marinepool"),
        MARMOT("Marmot"),
        MAURO_GRIFONI("Mauro Grifoni"),
        MAVI("Mavi"),
        MAZE("Maze"),
        MAZINE("Mazine"),
        MBYM("mbyM"),
        MCGREGOR("McGregor"),
        MELTIN_POT("Meltin Pot"),
        MERC("Merc"),
        MEXX("Mexx"),
        MICHAEL_KORS("Michael Kors"),
        MILLET("Millet"),
        MINIMUM("Minimum"),
        MINUS("Minus"),
        //        MISS_MISS("Miss Miss"),
        MISTER_MARCEL("Mister Marcel"),
        MITCHELL_N_NESS("Mitchell & Ness"),
        MKT_STUDIO("MKT Studio"),
        MODSTROEM("Modström"),
        MOLLY_BRACKEN("Molly Bracken"),
        //        MOM2MOM("Mom2moM"),
        MORE_N_MORE("More & More"),
        MORGAN("Morgan"),
        MORRIS("Morris"),
        MOS_MOSH("Mos Mosh"),
        MOEVE("Möve"),
        MUSTANG("Mustang"),
        MUUBAA("muubaa"),
        MYMO("myMo"),
        NAF_NAF("NAF NAF"),
        NAKETANO("Naketano"),
        NAPAPIJRI("Napapijri"),
        NATIVE_YOUTH("Native Youth"),
        NEEDLE_N_THREAD("Needle & Thread"),
        NELL_N_ME("Nell & Me"),
        NEW_LOOK("New Look"),
        //        NEW_YORKER("New Yorker"),
        NIKE("Nike"),
        NIKITA("Nikita"),
        NIXON("Nixon"),
        NOA_NOA("Noa Noa"),
        NOISY_MAY("Noisy May"),
        //        NOPPIES("Noppies"),
        NUDIE("Nudie"),
        NUEMPH("Nümph"),
        O_2ND("O'2nd"),
        O_NEILL("O'Neill"),
        OAKLEY("Oakley"),
        OAKWOOD("Oakwood"),
        OBJECT("Object"),
        ODLO("ODLO"),
        OLYMP_LEVEL_5("Olymp Level 5"),
        OLYMP_LUXOR("Olymp Luxor"),
        ONE_GREEN_ELEPHANT("One Green Elephant"),
        ONEPIECE("Onepiece"),
        ONLY("ONLY"),
        ONLY_N_SONS("Only & Sons"),
        //        OPENING_CEREMONY("Opening Ceremony"),
        OPUS("Opus"),
        ORIGINAL_PENGUIN("Original Penguin"),
        ORLEBAR_BROWN("Orlebar Brown"),
        OSCAR_JACOBSON("Oscar Jacobson"),
        OSMAN("Osman"),
        OTTO_KERN("Otto Kern"),
        PASSIGATTI("Passigatti"),
        PASSPORT("Passport"),
        PATAGONIA("Patagonia"),
        PATRIZIA_PEPE("Patrizia Pepe"),
        PEPE("Pepe"),
        PETROL_INDUSTRIES("Petrol Industries"),
        PF_BY_PAOLA_FRANI("PF by Paola Frani"),
        PIECES("Pieces"),
        PIER_ONE("Pier One"),
        PIERRE_BALMAIN("Pierre Balmain"),
        //        PRADA("Prada"),
        PRAIO("Praio"),
        PRINCESS_GOES_HOLLYWOOD("Princess goes Hollywood"),
        PUMA("Puma"),
        //        QUEEN_MUM("Queen Mum"),
        QUIKSILVER("Quiksilver"),
        R95TH("R95th"),
        RAGWEAR("Ragwear"),
        //        RALPH_LAUREN("Ralph Lauren"),
        RAINS("Rains"),
        REDSKINS("Redskins"),
        REDSOUL("REDSOUL"),
        //        REEBOK("Reebok"),
        REELL("REELL"),
        REGATTA("Regatta"),
        RELIGION("Religion"),
        RELISH("Relish"),
        RENE_DERHY("René Derhy"),
        RENE_LEZARD("René Lezard"),
        REPEAT("Repeat"),
        REPLAY("Replay"),
        RESTEROEDS("Resteröds"),
        REVOLUTION("Revolution"),
        RICH_N_ROYAL("Rich & Royal"),
        RIP_CURL("Rip Curl"),
        RIVER_ISLAND("River Island"),
        ROBINSON_LES_BAINS("Robinson Les Bains"),
        ROCKANDBLUE("ROCKANDBLUE"),
        RODEBJER("Rodebjer"),
        ROSE_A_POIS("Rosé a Pois"),
        ROSEMUNDE("Rosemunde"),
        ROXY("Roxy"),
        ROY_ROGERS("Roy Rogers"),
        RUSTY("Rusty"),
        S_OLIVER("s.Oliver"),
        SAIL_RACING("Sail Racing"),
        SAINT_TROPEZ("Saint Tropez"),
        SCHIESSER("Schiesser"),
        SCHOOL_RAG("School Rag"),
        SCHOTT_NYC("Schott NYC"),
        SCOTCH_N_SODA("Scotch & Soda"),
        SEAFOLLY("Seafolly"),
        SECOND_FEMALE("Second Female"),
        SEE_U_SOON("See u Soon"),
        SELECTED_FEMME("Selected Femme"),
        SELECTED_HOMME("Selected Homme"),
        SEIDENSTICKER("Seidensticker"),
        SERGE_BLANCO("Serge Blanco"),
        SET("SET"),
        //        SHINE_ORIGINAL("Shine Original"),
        SIGNUM("Signum"),
        SILVIAN_HEACH("Silvian Heach"),
        SISLEY("Sisley"),
        SLY_010("SLY 010"),
        SMASH("Smash"),
        SOAKED_IN_LUXURY("Soaked in Luxury"),
        SOFT_REBELS("Soft Rebels"),
        SOLID("Solid"),
        SOMEWEAR("Somewear"),
        SOULLAND("Soulland"),
        SOYACONCEPT("Soyaconcept"),
        SPARKZ("Sparkz"),
        //        SPIRAL("Spiral"),
        SPOOKS("Spooks"),
        SPORTALM("Sportalm"),
        ST_EMILE("St. Emile"),
        ST_MARTINS("st-martins"),
        STEFANEL("Stefanel"),
        STELLA_NOVA("Stella Nova"),
        STRAND("Strand"),
        STYLE_BUTLER("Style Butler"),
        SUBLEVEL("Sublevel"),
        SUNCOO("Suncoo"),
        SUNSEEKER("Sunseeker"),
        SUNSPEL("Sunspel"),
        //        SUPERDRY("Superdry"),
        SUPERTRASH("Supertrash"),
        SWEET_PANTS("Sweet Pants"),
        SWEET_YEARS("Sweet Years"),
        SWING("Swing"),
        TAIFUN("Taifun"),
        TAO("Tao"),
        TED_BAKER("Ted Baker"),
        TEDDY_SMITH("Teddy Smith"),
        TFNC("TFNC"),
        THAKOON_ADDITION("Thakoon Addition"),
        THE_BLUE_UNIFORM("The Blue Uniform"),
        THE_LOCAL_FIRM("The Local Firm"),
        THE_NORTH_FACE("The North Face"),
        TIBI("Tibi"),
        TIFFOSI("Tiffosi"),
        TIGER_OF_SWEDEN("Tiger of Sweden"),
        TIM_LABENDA("Tim Labenda"),
        TIMBERLAND("Timberland"),
        TOM_JOULE("Tom Joule"),
        TOM_TAILOR("Tom Tailor"),
        TOMMY_HILFIGER("Tommy Hilfiger"),
        TRAMONTANA("Tramontana"),
        TRUE_RELIGION("True Religion"),
        TWENTY8TWELVE("Twenty8Twelve"),
        TWINTIP("TWINTIP"),
        UCON_ACROBATICS("Ucon Acrobatics"),
        ULLA_POPKEN("Ulla Popken"),
        UNDER_ARMOUR("Under Armour"),
        UNIQUE("Unique"),
        URBAN_CLASSICS("Urban Classics"),
        US_POLO_ASSN("U.S. Polo Assn."),
        VAN_LAACK("van Laack"),
        VANS("Vans"),
        VAUDE("Vaude"),
        VELOUR("Velour"),
        VENICE_BEACH("Venice Beach"),
        VERSACE("Versace"),
        VERO_MODA("Vero Moda"),
        //        VERONIQUE_BRANQUINHO("Veronique Branquinho"),
        VILA("Vila"),
        VOI_JEANS("Voi Jeans"),
        VOLCOM("Volcom"),
        VOSSEN("Vossen"),
        WAL_G("WAL G."),
        WANDA_NYLON("Wanda Nylon"),
        WAREHOUSE("Warehouse"),
        WATERCULT("watercult"),
        WESC("WeSC"),
        WHYRED("Whyred"),
        WILDFOX("Wildfox"),
        WITTY_KNITTERS("Witty Knitters"),
        WRANGLER("Wrangler"),
        WOOD_WOOD("Wood Wood"),
        YOUR_TURN("YOUR TURN"),
        YUMI("Yumi"),
        ZALANDO("Zalando"),
        ZERGATIK("Zergatik"),
        ZIZZI("Zizzi"),
        ZOO_YORK("ZOO YORK"),
        NOT_SET("Brand not set");


        private String mDescriptor;
        private String color;


        Value(String descriptor) {
            mDescriptor = descriptor;
//            color = Colors.PURPLE;
        }


        public String getValueName(){
            return mDescriptor;
        }

        @Override
        public String descriptor() {
            return mDescriptor;
        }

        @Override
        public int index() {
            return ordinal();
        }

        public String getColor(){
            return color;
        }

        public String getSimpleName(){return mDescriptor;}
    }

    static {
        if (sAvailableBrands.size() == 0) {
            for (Value value1 : Value.values()) {
                sAvailableBrands.put(value1.descriptor(), value1);
            }
        }
    }

    public Label() {
        int numValues = Value.values().length;
        mValueWeights = new double[numValues];
        Arrays.fill(mValueWeights, 1.0 / numValues);
    }

    public Label(Value value) {
        setWeights(value);
    }

    public Label(String value) {
        value = value.trim();
        //Match the given String to a brand.
        if (sAvailableBrands.containsKey(value)) {
            setWeights(sAvailableBrands.get(value));
        } else if (value.startsWith("adidas")) {
            setWeights(Value.ADIDAS);
        } else if (value.startsWith("DC")) {
            setWeights(Value.DC);
        } else if (value.startsWith("khujo")) {
            setWeights(Value.KHUJO);
        } else if (value.startsWith("Ben Sherman")) {
            setWeights(Value.BEN_SHERMAN);
        } else if (value.startsWith("Nike")) {
            setWeights(Value.NIKE);
        } else if (value.startsWith("Schiesser")) {
            setWeights(Value.SCHIESSER);
        } else if (value.startsWith("Gerry Weber")) {
            setWeights(Value.GERRY_WEBER);
        } else if (value.startsWith("Escada")) {
            setWeights(Value.ESCADA);
        } else if (value.startsWith("Schott")) {
            setWeights(Value.SCHOTT_NYC);
        } else if (value.startsWith("Nudie")) {
            setWeights(Value.NUDIE);
        } else if (value.startsWith("Gaastra")) {
            setWeights(Value.GAASTRA);
        } else if (value.startsWith("Your Turn")) {
            setWeights(Value.YOUR_TURN);
        } else if (value.startsWith("Levi's")) {
            setWeights(Value.LEVI_S);
        } else if (value.startsWith("Seidensticker")) {
            setWeights(Value.SEIDENSTICKER);
        } else if (value.startsWith("Brooklyn")) {
            setWeights(Value.BROOKLYNS_OWN_BY_ROCAWEAR);
        } else if (value.startsWith("Jack & Jones")) {
            setWeights(Value.JACK_N_JONES);
        } else if (value.startsWith("Hilfiger") || value.startsWith("Tommy Hilfiger")) {
            setWeights(Value.TOMMY_HILFIGER);
        } else if (value.startsWith("Sir Oliver") || value.startsWith("s.Oliver")) {
            setWeights(Value.S_OLIVER);
        } else if (value.startsWith("Gant")) {
            setWeights(Value.GANT);
        } else if (value.startsWith("Pepe")) {
            setWeights(Value.PEPE);
        } else if (value.startsWith("ESPRIT") || value.startsWith("Esprit") || value.startsWith("edc by Esprit")) {
            setWeights(Value.ESPRIT);
        } else if (value.startsWith("Burton")) {
            setWeights(Value.BURTON);
        } else if (value.startsWith("Tom Tailor")) {
            setWeights(Value.TOM_TAILOR);
        } else if (value.startsWith("Calvin Klein")) {
            setWeights(Value.CALVIN_KLEIN);
        } else if (value.startsWith("Mexx")) {
            setWeights(Value.MEXX);
        } else if (value.startsWith("KARL LAGERFELD")) {
            setWeights(Value.LAGERFELD);
        } else if (value.startsWith("Tiger of Sweden")) {
            setWeights(Value.TIGER_OF_SWEDEN);
        } else if (value.startsWith("Versace")) {
            setWeights(Value.VERSACE);
        } else if (value.startsWith("Zalando")) {
            setWeights(Value.ZALANDO);
        } else {
            setWeights(Value.NOT_SET);
            Log.d("Label", "Unknown: " + value.toUpperCase().replace(" ", "_") + "(\"" + value + "\"),");
        }
    }

    private void setWeights(Value value) {
        mValueWeights = new double[Value.values().length];
        Arrays.fill(mValueWeights, 0.0);
        mValueWeights[value.ordinal()] = 1.0;
        currentValue(value);
    }

    @Override
    public String id() {
        return ID;
    }

    @Override
    public Value[] getValueSymbols() {
        return Value.values();
    }

    /**
     * Changes the behavior to also increase the weight of neighboring weights.
     * E.g. a user might like items priced in a little more expensive or a
     * little cheaper based on the price range he liked.
     */
    @Override
    public void likeValue(int indexLiked, double[] weights) {
        Value[] values = Value.values();
        Value valueLiked = values[indexLiked];
        List<Value> similarValues = Graphs.neighborListOf(sSimilarValues, valueLiked);

        // do regular like for liked value
        super.likeValue(indexLiked, weights);

        if (similarValues.isEmpty()) {
            // no similarities: done!
            return;
        }

        // now do dampened like on similar values
        double increaseLiked = 1.0 / (weights.length - 1);
        double increaseSimilarities = increaseLiked / 2;
        // per similar value increase
        double increaseSimilar = increaseSimilarities / similarValues.size();
        // per non-similar and non-liked value decrease
        double decreaseOthers = increaseSimilarities / (weights.length - similarValues.size() - 1);

        // actually add and subtract
        for (int i = 0; i < weights.length; i++) {
            if (i == indexLiked) {
                // skip liked value
                continue;
            }
            if (hasValueWithSameIndex(similarValues, i)) {
                // increase similar values
                weights[i] += increaseSimilar;
            } else {
                // decrease other values
                weights[i] -= decreaseOthers;
                // floor at 0.0
                if (weights[i] < 0) {
                    weights[i] = 0.0;
                }
            }
        }

        ensureSumBound(weights);
    }

    /**
     * Checks whether one of the values has the given index.
     */
    private boolean hasValueWithSameIndex(List<Value> values, int index) {
        for (Value value : values) {
            if (value.index() == index) {
                return true;
            }
        }
        return false;
    }

    public AttributeValue[] getAttributeValues() {
        return Value.values();
    }
}
