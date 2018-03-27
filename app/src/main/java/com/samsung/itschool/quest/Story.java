package com.samsung.itschool.quest;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by User on 24.12.2017.
 */

public class Story {

    private Situation start_story;
    public Situation current_situation;

    private Situation officeParty = new Situation(

            "За такую выходку Босс выписал штраф, чем сильно задел меня, ведь я хотел сделать как лучше. Неудачное начало, но сегодня в конторе корпоратив! \n"
                    + "(1)Идти и подцепить там кого-нибудь ;)  \n"
                    + "(2)Не идти, а остаться дома и посвятить этот вечер себе любимому, диванчику и сериалам \n",
            2, 0, -10, -10);
    private Situation Boss = new Situation(

            "Меня неожиданно вызвали,"
                    + "есть сведения, что босс доволен сделкой. \n"
                    + "(1) Зайти к нему в кабинет резко, дерзко и без стука \n"
                    + "(2) Предварительно постучавшись, дрожащим голосом спросить: 'Можно?' \n"
            ,
            3, 1, 100, 0);
    private Situation Client = new Situation(

            "Клиент остался доволен моей работой, если не сказать, что был в восторге \n(1) Потребовать от босса повышения \n"
                    + "(2) Познакомиться с этим клиентом поближе"
            , 2, 0,
            50, 1);

    private Situation FirstMeet  = new Situation("Это Аня. Она оказалась приятным собеседником,и мы весь вечер провели вместе \n(1) Позвать Аню к себе \n" + "(2) Проводить Аню до дома",2,0,0,5);
    private Situation PrettyWoman = new Situation(
            "На горизонте показалась симпатичная особа \n(1) Подойти и познакомиться? \n"+
            "(2) Продолжать стоять, как столб, да, столб, конечно, тоже красивый, но хватит уже стоять",2,0,0,5
    );
    private Situation SecondMeet  = new Situation("Вечер оказался тухленьким, ушёл домой. А утром снова на горизонте эта особа \n(1) Подойти и познакомиться \n"+
            "(2) Продолжать работать, и это будет самый унылый исход этого квеста",2,0,0,-5);
    private Situation Night = new Situation("Аня согласилась \n Мы провели целую ночь вместе, когда утром мы зашли в офис вместе, меня босс сразу же затащил к себе \n"
            + "Аня - его дочь, нельзя так с девушками поступать. И босс меня уволил \n P.S. Уж не думала я, что до такой концовки дойдете",0,-1,-100000,-100);
    private Situation StayAtHome = new Situation("Провел вечер наедине с сериалами \n На утро все вспоминали вчерашние похождения, жаль, что не пошёл \n(1) Подойти и познакомиться со всеми \n"+
            "(2) Продолжать работать",2,0,0,-5);

    private Situation JustEvening = new Situation("Я проводил Аню до дома\nКак оказалось позже, Аня - дочь босса. Надо делать все быстро, иначе счастье перепадет кому-то другому: 'Сделать Ане предложение ?'\n "
                    +"(1) Да \n"
                    +"(2) Нет",2,0,0,10);

    private Situation Proposal = new Situation("Я сделал Ане предложение (вот это я молодец), она согласилась (неудивительно)\nБосс, когда узнал, очень обрадовался и сделал своим преемником",0,10,100000,50);
    private Situation BrokeUp = new Situation("Разорвал с Аней, чем сильно обидел её \nПришел босс, сказал, что я разбил сердце его дочери, и уволил. Печально",0,-1,-100000,-50);
    private Situation Date = new Situation("А всё-таки эта Аня неплохая. Позвать ее прогуляться? \n(1) Зову! \n" + "(2) Да ну её!",2,0,0,5);
    private Situation TrueWorker = new Situation("Поздравляю, Вы можете закрыть этот квест\nЯ тратил все время только на работу, коллеги странно шушукаются. \n Поздравляю, Я офисный планктон! Умру в одиночестве, но с баблом (что не факт)",0,2,100000,-40);
    private Situation AskABoss = new Situation("'Хочу поднять бабла' - заявил я с порога\nБосс спросил: 'Дерзкий что ли?'\n(1) Да\n(2)Нет, прошу прощения",2,0,0,5);
    private Situation Yes = new Situation("'И правильно, вечером с нами в бар идешь?' \n(1)Да\n(2)Н-н-нет",2,0,0,20);
    private Situation DoubleYes = new Situation("А он оказался славным малым\nМы с боссом подружились, теперь он готов сделать меня своим замом. Да, денег будет много",0,5,10000,30);
    private Situation No = new Situation("Все вокруг странно шушукаются\nКак оказалось позже, все знают о нашем разговоре с боссом (какое он всё-таки тряпло!). Может уволиться?",0,0,0,-50);
    private Situation Lady = new Situation("Клиентом оказалась милая приветливая девушка Инна\n(1)Может прогуляемся?\n(2)Работа, работа и только работа (вариант совсем для зануд)",2,0,0,0);
    private Situation Gossip = new Situation("Предлагаю потешить своё самолюбие и рассказать всё коллегам\n(1)Да\n(2)Нет",2,0,0,5);
    private Situation Wedding = new Situation("Инна позвала меня уехать с ней в Калифорнию, и я, конечно, согласился",0,5,1000000,50);
    private Situation Choice = new Situation("Познакомился с девушкой Аней, она оказалась дочерью босса\nЁжику понятно, что Аня принесёт мне денег, хотя и Инну нельзя ещё сбрасывать со счетов\nТак кто же?\n(1)Аня \n(2)Инна",2,1,0,15);

    private Situation Shockk = new Situation("Открываю дверь с пинка...\nНа столе спиной ко мне сидит мой босс и вводит себе в венну какую-то жидкость. Безумно испугавшись, тихо закрываю дверь и ухожу на своё место \n(1) Сказать коллегам\n(2)Лучше не говорить",2,0,0,10);
    private Situation ToldEverything = new Situation("Рассказал всё девушке Ане,она единственная, кто тоже ничего не делает и охотно болтает со всеми подряд\nПосле моего рассказа Аня резко вскочила и побежала к кабинету босса. Я её остановил, но та, вырвавшись, прокричала, что её папаша сейчас отхватит от неё. Она его дочь?! \n(1)Остановить её\n(2)Встать на сторону Ани",2,0,0,20);
    private Situation THeEnd = new Situation("Меня уволили, босса увезли в больницу, но у меня есть прекрасная девушка. По-моему, прекрасная развязка",0,-1,0,70);
    private Situation LOX = new Situation("Меня уволили!\nБосс выгнал взашей из своей компании, Аня меня ненавидит. Зачем я вообще заходил тогда?!",0,-2,-50000,-50);
    private Situation OnMyself = new Situation("Я начал собственное расследование\nЭтим делом заинтересовалась моя коллега Аня, рассказать ей? \n(1)Да\n(2)Нет",2,0,0,0);
    private Situation OnMyself2 = new Situation("Ничего нового я не смог узнать\nМожет всё-таки Аня?\n(1)Да\n(2)Нет",2,0,0,-15);
    private Situation OnMyself3 = new Situation("Я слишком увлёкся и, занявшись расследованием, забил на работу, в следствие чего меня уволили. Как оказалось, босс меня тогда не заметил",0,-1,-50000,-40);
    private Situation Silence = new Situation("Никто не отвечает\n(1)Ждать\n(2)Ворваться",2,0,0,-5);
    private Situation Wait = new Situation("Дверь приоткрыта\nЗаглядываю внутрь, а там босс убирает в шкаф шприцы и какие-то ампулы. Увидев меня, пугается, подбегает нетвёрдой походкой, закрывает дверь. Угрожает, просит, умоляет не говорить никому.\n(1)Согласиться\n(2)Отказаться",2,0,0,15);
    private Situation Accept = new Situation("Быть честным и оставить босса самостоятельно разбираться с его проблемами или попросить помощи у общественности?\n(1)Сказать всем\n (2)Молчать",2,0,10000,15);
    private Situation Beer = new Situation("Спустя пару дней босс сказал мне: 'А ты славный малый, пойдешь сегодня с нами в бар?'  \n(1)Да\n(2)Нет и придумать нелепую отговорку",2,0,10000,20);
    private Situation Fired = new Situation("Утром увидел на столе приказ о моем увольнении. Печально",0,-1,-50000,-40);









    Story() {
        start_story = new Situation(
                "Только вы начали работать и тут же удача! Вы нашли клиента и продаете ему "
                        + "партию ПО MS Windows. Ему, в принципе, достаточно взять 100 коробок версии HOME.\n"
                        + "(1)У клиента денег много, надо подумать и о себе любимом\n"
                        + "(2)Чуть дороже сделаем, и клиент доволен, и мне перепадёт\n"
                        + "(3)Как надо, так и сделаем, ведь главное - довольный клиент ",
                3, 0, 0, 0);


        start_story.direction[0] = officeParty;
        start_story.direction[1] = Boss;
        start_story.direction[2] = Client;
        current_situation = start_story;
        officeParty.direction[0] = PrettyWoman;
        officeParty.direction[1] = StayAtHome;
        PrettyWoman.direction[0] = FirstMeet;
        PrettyWoman.direction[1] = SecondMeet;
        FirstMeet.direction[0] = Night;
        FirstMeet.direction[1] = JustEvening;
        JustEvening.direction[0] = Proposal;
        JustEvening.direction[1] = BrokeUp;
        StayAtHome.direction[0] = PrettyWoman;
        StayAtHome.direction[1] = TrueWorker;
        SecondMeet.direction[1] = TrueWorker;
        SecondMeet.direction[0] = Date;
        Date.direction[0] = JustEvening;
        Date.direction[1] = TrueWorker;
        Client.direction[0] = AskABoss;
        Client.direction[1] = Lady;
        AskABoss.direction[0] = Yes;
        AskABoss.direction[1] = No;
        Yes.direction[0] = DoubleYes;
        Yes.direction[1] = No;
        Lady.direction[0] = Gossip;
        Lady.direction[1] = No;
        Gossip.direction[0] = Choice;
        Gossip.direction[1] = Wedding;
        Choice.direction[0] = Date;
        Choice.direction[1] = Wedding;
        Boss.direction[0] = Shockk;
        Boss.direction[1] = Silence;
        Shockk.direction[0] = ToldEverything;
        Shockk.direction[1] = OnMyself;
        ToldEverything.direction[0] = LOX;
        ToldEverything.direction[1] = THeEnd;
        OnMyself.direction[0] = ToldEverything;
        OnMyself.direction[1] = OnMyself2;
        OnMyself2.direction[0] = ToldEverything;
        OnMyself2.direction[1] = OnMyself3;
        Silence.direction[0] = Wait;
        Silence.direction[1] = Shockk;
        Wait.direction[0] = Accept;
        Wait.direction[1] = Fired;
        Accept.direction[1] = Beer;
        Beer.direction[0] = DoubleYes;
        Beer.direction[1] = No;
        Accept.direction[0] = Fired;

    }

    public void go(int num, Story story, Button btn3, Characteer hero, TextView tv_head, TextView tv_main) {
        if (!story.isEnd(num)) {
            current_situation = current_situation.direction[num - 1];
            btn3.setVisibility(View.GONE);
            hero.A += story.current_situation.dA;
            hero.K += story.current_situation.dK;
            hero.P += story.current_situation.dR;
            tv_head.setText("Активы: " + hero.A + "\nРепутация: " + hero.P + "\nКарьера: " + hero.K);
            tv_main.setText(story.current_situation.text);
        }
        else{
            current_situation = current_situation.direction[num - 1];
            hero.A += story.current_situation.dA;
            hero.K += story.current_situation.dK;
            hero.P += story.current_situation.dR;
            tv_main.setText(story.current_situation.text + "\nАктивы: " + hero.A + "\nРепутация: " + hero.P + "\nКарьера: " + hero.K);
            tv_head.setText("The end");
        }

    }

    private boolean isEnd(int num) {
        return current_situation.direction[num - 1].direction.length == 0;
    }
}
