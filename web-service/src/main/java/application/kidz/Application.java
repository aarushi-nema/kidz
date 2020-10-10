package application.kidz;

import application.kidz.defined.helper.*;
import application.kidz.defined.resource.*;
import application.kidz.servlet.Layout;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import platform.manager.GlobalDataManager;
import platform.webservice.manager.BoltViewManager;

import java.util.ArrayList;
import java.util.List;


@SpringBootApplication()
@ComponentScan(basePackages = {"application.kidz.controller"})
public class Application  {
    static public void populate_default_database() {
        Thread  thread = new Thread(new Runnable() {
            @Override
            public void run() {
            }
        });
        thread.start();
    }

    public static void registerService() {


    }

    public static void registerHelpers() {

    }

    public static void registerdecorators() {

    }
    public static void loadData() {
        loadWordFamily();
        loadsightword();
    }
    public static void loadsightword() {

        SightWord word = new SightWord("i");
        word.setName("I");
        SightWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new SightWord("a");
        word.setName("a");
        SightWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new SightWord("an");
        word.setName("an");
        SightWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new SightWord("am");
        word.setName("am");
        SightWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new SightWord("read");
        word.setName("read");
        SightWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new SightWord("walk");
        word.setName("walk");
        SightWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new SightWord("talk");
        word.setName("talk");
        SightWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new SightWord("run");
        word.setName("run");
        SightWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new SightWord("speak");
        word.setName("speak");
        SightWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new SightWord("are");
        word.setName("are");
        SightWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new SightWord("was");
        word.setName("was");
        SightWordHelper.getInstance().AddOrUpdateNoCache(word);

        List<String> list;
        SightWordCategoryType  type = new SightWordCategoryType("various_category");
        type.setName("Various Category");
        SightWordCategoryTypeHelper.getInstance().AddOrUpdateNoCache(type);

        SightWordCategory category = new SightWordCategory("various_category_action");
        category.setName("action");
        category.setType("various_category");
        list = new ArrayList<>();
        list.add("read");
        list.add("walk");
        list.add("talk");
        list.add("run");
        list.add("speak");
        category.setWords(list);
        SightWordCategoryHelper.getInstance().AddOrUpdateNoCache(category);


        type = new SightWordCategoryType("day_wise");
        type.setName("Day wise");
        SightWordCategoryTypeHelper.getInstance().AddOrUpdateNoCache(type);

        category = new SightWordCategory("day_wise_day_001");
        category.setName("Day 001");
        category.setType("day_wise");
        SightWordCategoryHelper.getInstance().AddOrUpdateNoCache(category);

        category = new SightWordCategory("day_wise_day_002");
        category.setName("Day 003");
        category.setType("day_wise");
        SightWordCategoryHelper.getInstance().AddOrUpdateNoCache(category);

        category = new SightWordCategory("day_wise_day_004");
        category.setName("Day 004");
        category.setType("day_wise");
        SightWordCategoryHelper.getInstance().AddOrUpdateNoCache(category);

        type = new SightWordCategoryType("number_of_character");
        type.setName("Number of Character");
        SightWordCategoryTypeHelper.getInstance().AddOrUpdateNoCache(type);

        category = new SightWordCategory("number_of_character_1");
        category.setName("Character 01");
        category.setType("number_of_character");
        list = new ArrayList<>();
        list.add("a");
        list.add("i");
        category.setWords(list);
        SightWordCategoryHelper.getInstance().AddOrUpdateNoCache(category);

        category = new SightWordCategory("number_of_character_2");
        category.setName("Character 02");
        category.setType("number_of_character");
        list = new ArrayList<>();
        list.add("am");
        list.add("an");
        category.setWords(list);
        SightWordCategoryHelper.getInstance().AddOrUpdateNoCache(category);

        category = new SightWordCategory("number_of_character_3");
        category.setName("Character 03");
        list = new ArrayList<>();
        list.add("are");
        list.add("was");
        category.setWords(list);
        category.setType("number_of_character");
        SightWordCategoryHelper.getInstance().AddOrUpdateNoCache(category);


    }
    public static void loadWordFamily() {
        WordFamily family = new WordFamily("an");
        family.setName("an");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        WordFamilyWord word = new WordFamilyWord("an-can");
        word.setName("can");
        word.setFamily("an");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("an-fan");
        word.setName("fan");
        word.setFamily("an");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("an-man");
        word.setName("man");
        word.setFamily("an");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("an-pan");
        word.setName("pan");
        word.setFamily("an");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("an-van");
        word.setName("van");
        word.setFamily("an");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        family = new WordFamily("ab");
        family.setName("ab");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("ab-cab");
        word.setName("cab");
        word.setFamily("ab");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ab-tab");
        word.setName("tab");
        word.setFamily("ab");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ab-nab");
        word.setName("nab");
        word.setFamily("ab");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        family = new WordFamily("ad");
        family.setName("ad");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("ad-dad");
        word.setName("dad");
        word.setFamily("ad");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ad-pad");
        word.setName("pad");
        word.setFamily("ad");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ad-sad");
        word.setName("sad");
        word.setFamily("ad");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ad-bad");
        word.setName("bad");
        word.setFamily("ad");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);


        family = new WordFamily("ap");
        family.setName("ap");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("ap-cap");
        word.setName("cap");
        word.setFamily("ap");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ap-gap");
        word.setName("gap");
        word.setFamily("ap");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ap-lap");
        word.setName("lap");
        word.setFamily("ap");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ap-map");
        word.setName("map");
        word.setFamily("ap");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ap-tap");
        word.setName("tap");
        word.setFamily("ap");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ap-nap");
        word.setName("nap");
        word.setFamily("ap");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        family = new WordFamily("ag");
        family.setName("ag");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("ag-bag");
        word.setName("bag");
        word.setFamily("ag");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ag-tag");
        word.setName("tag");
        word.setFamily("ag");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ag-rag");
        word.setName("rag");
        word.setFamily("ag");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ag-nag");
        word.setName("nag");
        word.setFamily("ag");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        family = new WordFamily("am");
        family.setName("am");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("am-dam");
        word.setName("dam");
        word.setFamily("am");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("am-jam");
        word.setName("jam");
        word.setFamily("am");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        family = new WordFamily("at");
        family.setName("at");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("at-cat");
        word.setName("cat");
        word.setFamily("at");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("at-bat");
        word.setName("bat");
        word.setFamily("at");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("at-fat");
        word.setName("fat");
        word.setFamily("at");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("at-hat");
        word.setName("hat");
        word.setFamily("at");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("at-pat");
        word.setName("pat");
        word.setFamily("at");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("at-rat");
        word.setName("rat");
        word.setFamily("at");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("at-sat");
        word.setName("sat");
        word.setFamily("at");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        family = new WordFamily("et");
        family.setName("et");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("et-jet");
        word.setName("jet");
        word.setFamily("et");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("et-met");
        word.setName("met");
        word.setFamily("et");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("et-net");
        word.setName("net");
        word.setFamily("et");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("et-pet");
        word.setName("pet");
        word.setFamily("et");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("et-wet");
        word.setName("wet");
        word.setFamily("et");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("et-get");
        word.setName("get");
        word.setFamily("et");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("et-let");
        word.setName("let");
        word.setFamily("et");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        family = new WordFamily("en");
        family.setName("en");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("en-den");
        word.setName("den");
        word.setFamily("en");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("en-hen");
        word.setName("hen");
        word.setFamily("en");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("en-pen");
        word.setName("pen");
        word.setFamily("en");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("en-ten");
        word.setName("ten");
        word.setFamily("en");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        family = new WordFamily("eg");
        family.setName("eg");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("eg-egg");
        word.setName("egg");
        word.setFamily("eg");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("eg-leg");
        word.setName("leg");
        word.setFamily("eg");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("eg-keg");
        word.setName("keg");
        word.setFamily("eg");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        family = new WordFamily("ed");
        family.setName("ed");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("ed-bed");
        word.setName("bed");
        word.setFamily("ed");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ed-fed");
        word.setName("fed");
        word.setFamily("ed");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ed-red");
        word.setName("red");
        word.setFamily("ed");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ed-wed");
        word.setName("wed");
        word.setFamily("ed");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);



        family = new WordFamily("it");
        family.setName("it");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("it-fit");
        word.setName("fit");
        word.setFamily("it");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("it-hit");
        word.setName("hit");
        word.setFamily("it");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("it-kit");
        word.setName("kit");
        word.setFamily("it");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("it-lit");
        word.setName("lit");
        word.setFamily("it");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("it-sit");
        word.setName("sit");
        word.setFamily("it");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("it-bit");
        word.setName("bit");
        word.setFamily("it");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);


        family = new WordFamily("in");
        family.setName("in");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("in-bin");
        word.setName("bin");
        word.setFamily("in");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("in-fin");
        word.setName("fin");
        word.setFamily("in");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("in-pin");
        word.setName("pin");
        word.setFamily("in");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("in-tin");
        word.setName("tin");
        word.setFamily("in");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("in-win");
        word.setName("win");
        word.setFamily("in");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        family = new WordFamily("ig");
        family.setName("ig");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("ig-big");
        word.setName("big");
        word.setFamily("ig");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ig-fig");
        word.setName("fig");
        word.setFamily("ig");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ig-dig");
        word.setName("dig");
        word.setFamily("ig");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ig-pig");
        word.setName("pig");
        word.setFamily("ig");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ig-wig");
        word.setName("wig");
        word.setFamily("ig");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);


        family = new WordFamily("id");
        family.setName("id");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("id-hid");
        word.setName("hid");
        word.setFamily("id");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("id-kid");
        word.setName("kid");
        word.setFamily("id");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("id-lid");
        word.setName("lid");
        word.setFamily("id");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("id-did");
        word.setName("did");
        word.setFamily("id");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        family = new WordFamily("ip");
        family.setName("ip");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("ip-dip");
        word.setName("dip");
        word.setFamily("ip");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ip-lip");
        word.setName("lip");
        word.setFamily("ip");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ip-hip");
        word.setName("hip");
        word.setFamily("ip");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ip-tip");
        word.setName("tip");
        word.setFamily("ip");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ip-sip");
        word.setName("sip");
        word.setFamily("ip");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);


        family = new WordFamily("ib");
        family.setName("ib");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("ib-bib");
        word.setName("dib");
        word.setFamily("ib");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ib-rib");
        word.setName("rib");
        word.setFamily("ib");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ib-nib");
        word.setName("nib");
        word.setFamily("ib");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);


        family = new WordFamily("ix");
        family.setName("ix");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("ix-six");
        word.setName("six");
        word.setFamily("ix");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ix-fix");
        word.setName("fix");
        word.setFamily("ix");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        family = new WordFamily("ot");
        family.setName("ot");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("ot-cot");
        word.setName("cot");
        word.setFamily("ot");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ot-hot");
        word.setName("hot");
        word.setFamily("ot");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ot-dot");
        word.setName("dot");
        word.setFamily("ot");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ot-pot");
        word.setName("pot");
        word.setFamily("ot");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ot-rot");
        word.setName("rot");
        word.setFamily("ot");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ot-got");
        word.setName("got");
        word.setFamily("ot");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ot-not");
        word.setName("not");
        word.setFamily("ot");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        family = new WordFamily("ox");
        family.setName("ox");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        family = new WordFamily("og");
        family.setName("og");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("og-dog");
        word.setName("dog");
        word.setFamily("og");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("og-fog");
        word.setName("fog");
        word.setFamily("og");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("og-jog");
        word.setName("jog");
        word.setFamily("og");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("og-log");
        word.setName("log");
        word.setFamily("og");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);


        family = new WordFamily("ob");
        family.setName("ob");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("ob-cob");
        word.setName("cob");
        word.setFamily("ob");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ob-job");
        word.setName("job");
        word.setFamily("ob");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ob-mob");
        word.setName("mob");
        word.setFamily("ob");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ob-rob");
        word.setName("rob");
        word.setFamily("ob");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ob-sob");
        word.setName("sob");
        word.setFamily("ob");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ob-nob");
        word.setName("nob");
        word.setFamily("ob");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        family = new WordFamily("op");
        family.setName("op");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("op-mop");
        word.setName("mop");
        word.setFamily("op");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("op-top");
        word.setName("top");
        word.setFamily("op");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("op-cop");
        word.setName("cop");
        word.setFamily("op");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("op-pop");
        word.setName("pop");
        word.setFamily("op");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("op-hop");
        word.setName("hop");
        word.setFamily("op");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        family = new WordFamily("ox");
        family.setName("ox");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("ox-ox");
        word.setName("ox");
        word.setFamily("ox");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ox-box");
        word.setName("box");
        word.setFamily("ox");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ox-fox");
        word.setName("fox");
        word.setFamily("ox");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ox-pox");
        word.setName("pox");
        word.setFamily("ox");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        family = new WordFamily("od");
        family.setName("od");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("od-cod");
        word.setName("cod");
        word.setFamily("od");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("od-god");
        word.setName("god");
        word.setFamily("od");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("od-nod");
        word.setName("nod");
        word.setFamily("od");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("od-pod");
        word.setName("pod");
        word.setFamily("od");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("od-rod");
        word.setName("rod");
        word.setFamily("od");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);


        family = new WordFamily("ut");
        family.setName("ut");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("ut-cut");
        word.setName("cut");
        word.setFamily("ut");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ut-hut");
        word.setName("hut");
        word.setFamily("ut");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ut-nut");
        word.setName("nut");
        word.setFamily("ut");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ut-but");
        word.setName("but");
        word.setFamily("ut");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        family = new WordFamily("ub");
        family.setName("ub");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("ub-cub");
        word.setName("cub");
        word.setFamily("ub");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ub-cub");
        word.setName("cub");
        word.setFamily("ub");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ub-tub");
        word.setName("tub");
        word.setFamily("ub");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ub-rub");
        word.setName("rub");
        word.setFamily("ub");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ub-hub");
        word.setName("hub");
        word.setFamily("ub");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);


        family = new WordFamily("ug");
        family.setName("ug");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("ug-bug");
        word.setName("bug");
        word.setFamily("ug");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ug-jug");
        word.setName("jug");
        word.setFamily("ug");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ug-mug");
        word.setName("mug");
        word.setFamily("ug");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ug-hug");
        word.setName("hug");
        word.setFamily("ug");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ug-hug");
        word.setName("hug");
        word.setFamily("ug");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        family = new WordFamily("un");
        family.setName("un");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("ug-bun");
        word.setName("bun");
        word.setFamily("un");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ug-fun");
        word.setName("fun");
        word.setFamily("un");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ug-gun");
        word.setName("gun");
        word.setFamily("un");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ug-run");
        word.setName("run");
        word.setFamily("un");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("ug-sun");
        word.setName("sun");
        word.setFamily("un");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        family = new WordFamily("up");
        family.setName("up");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("up-cup");
        word.setName("cup");
        word.setFamily("up");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("up-up");
        word.setName("up");
        word.setFamily("up");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        family = new WordFamily("us");
        family.setName("us");
        WordFamilyHelper.getInstance().AddOrUpdateNoCache(family);

        word = new WordFamilyWord("up-bus");
        word.setName("bus");
        word.setFamily("us");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);

        word = new WordFamilyWord("up-us");
        word.setName("us");
        word.setFamily("us");
        WordFamilyWordHelper.getInstance().AddOrUpdateNoCache(word);
    }

    public static void main(String[] args) {
        GlobalDataManager.getInstance().setProduct("bolt");
        BoltViewManager.getInstance().setLayout(new Layout());
        registerHelpers();
        registerdecorators();
        registerService();
        loadData();
        populate_default_database();
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        System.out.println("Let's inspect the beans provided by Spring Boot:");
    }

}

