
//编写一个乙女游戏

import java.util.Scanner;

public class 星见雅约会系统 {


    public static void main(String[] args) {
        int dot = 0;
        Scanner scanner = new Scanner(System.in);
        String message = "欢迎来到新艾利都！";
        spt(message);


        System.out.println();
        String message1 = "请输入星见雅对你的称呼：";
        spt(message1);
        String name = scanner.nextLine();
        while (true) {
            String message2 = name + "，今天想去哪里？";
            spt(message2);
            System.out.println();
            second();

            System.out.println("热望角（1）; 光映广场（0）");
            int choice = scanner.nextInt();
            //地点选择：热望角
            if (choice == 1) {
                String message3 = "热望角吗……那里有很多有趣的事情。我们走吧";
                spt(message3);
                System.out.println();
                String message4 = "×与星见雅坐地铁来到了热望角。";
                spt(message4);

                System.out.println();
                //转场
                String message5 = "。。。。。";
                for (char c : message5.toCharArray()) {
                    System.out.print(c);
                    try {
                        Thread.sleep(1000); // 暂停1秒
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println();
                String message6 = "水吧。要喝点什么吗？";
                spt(message6);
                System.out.println("茶奶（0）; 鸡尾酒（1）；还是不了（2）");
                int choice1 = scanner.nextInt();
                //饮品选择：茶奶
                if (choice1 == 0) {
                    String message7 = "茶奶。甜甜的，是柳喜欢的风格";
                    spt(message7);
                    second();
                    System.out.println();
                    System.out.println("好感度+1");//好感度+1
                    dot++;
                    second();


                    System.out.println("那……你呢？（1）；哦～想不到柳这样严肃的人也喜欢喝茶奶（0）");
                    int choice2 = scanner.nextInt();
                    if (choice2 == 1) {
                        System.out.println("那……你呢？");
                        second();
                        String message8 = "我的话，和你一起喝什么都很开心。";
                        spt(message8);
                        System.out.println();
                        System.out.println("好感度+1");//好感度+1
                        dot++;
                        //热望角登出口1
                    } else {
                        System.out.println("哦～想不到柳这样严肃的人也喜欢喝茶奶");
                        try {
                            Thread.sleep(1000); // 停顿一秒
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        String message8 = "你平时……一直在关注柳吗？";
                        spt(message8);
                        System.out.println();
                        System.out.println("是（1）；才没有！只是因为是你的同事，所以比较在意（0）");
                        int choice3 = scanner.nextInt();
                        if (choice3 == 1) {
                            System.out.println("是！");
                            second();
                            String message9 = "嗯……原来是这样吗";
                            spt(message9);
                            System.out.println();
                            String message10 = "还以为那几次是专程来看我。看来虚狩也有犯错的时候。";
                            spt(message9);
                            System.out.println();
                            System.out.println("好感度-1");//好感度-1
                            dot--;
                            //热望角登出口2

                        } else {
                            System.out.println("才没有！只是因为是你的同事，所以比较在意");
                            second();
                            String message9 = "你在意我。谢谢。我也是。";
                            spt(message9);
                            System.out.println();
                            System.out.println("好感度+1");//好感度+1
                            dot++;
                        }
                        //热望角登出口3
                    }


                }
                //饮品选择：鸡尾酒
                else if (choice1 == 1) {
                    String message7 = "鸡尾酒……可以尝试。";
                    spt(message7);
                    System.out.println();
                    second();
                    System.out.println("×星见雅仿佛下定了某种决心，扬起头把一杯彩虹鸡尾酒倒进嘴里。");
                    second();
                    System.out.println();
                    String message8 = "唔，，，，，";
                    for (char c : message8.toCharArray()) {
                        System.out.print(c);
                        try {
                            Thread.sleep(1000); // 暂停1秒
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println();
                    System.out.println("一口气全都喝完了吗？？？（1）；你的脸好红……（0）");
                    int choice2 = scanner.nextInt();
                    if (choice2 == 1) {
                        System.out.println("一口气全都喝完了吗？？？");
                        second();
                        System.out.println();
                        String message9 = "嗯，，，，，";
                        for (char c : message9.toCharArray()) {
                            System.out.print(c);
                            try {
                                Thread.sleep(1000); // 暂停1秒
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println();
                        String message10 = "这是我第一次喝酒。酗酒不是虚狩应该有的修行。";
                        spt(message10);
                        System.out.println();
                        String message11 = "是为了你才喝的。";
                        spt(message11);
                        System.out.println();
                        String message12 = "嗯……因为彩虹，和我们很相配。";
                        spt(message12);
                        System.out.println();
                        System.out.println("好感度+1");//好感度+1
                        dot++;
                        //热望角登出口4


                    } else {
                        System.out.println("你的脸好红……");
                        System.out.println("雅是不是不太能喝酒？（1）；脸红的雅没怎么见过呢……好可爱（0）");
                        int choice3 = scanner.nextInt();
                        if (choice3 == 1) {
                            System.out.println("雅是不是不太能喝酒？");
                            second();
                            System.out.println();
                            String message9 = "作为虚狩，不能承认自己酒量差。";
                            spt(message9);
                            System.out.println();
                            String message10 = "就当是，为了你脸红的。";
                            spt(message10);
                            System.out.println();
                            System.out.println("好感度+1");//好感度+1
                            dot++;
                            //热望角登出口5


                        } else {
                            System.out.println("脸红的雅没怎么见过呢……好可爱");
                            second();
                            System.out.println();
                            String message9 = "看来以前约会的时候，我的修行进行得很成功。";
                            spt(message9);
                            System.out.println();
                            System.out.println("什么修行？（1）");
                            int choice4 = scanner.nextInt();
                            if (choice4 == 1) {
                                System.out.println("什么修行？");
                                second();
                                System.out.println();
                                String message10 = "喜欢一个人保持不脸红的修行。";
                                spt(message10);
                            }
                            System.out.println();
                            System.out.println("好感度+1");//好感度+1
                            dot++;
                            //热望角登出口6


                        }
                    }

                }
                //饮品选择：不了
                else {
                    System.out.println("还是不了");
                    second();
                    System.out.println();
                    String message7 = "绳匠果然是自律的人呢。还是自己买一杯好了。";
                    spt(message7);
                    System.out.println();
                    second();
                    System.out.println("我请你吧！（1）；不不，雅小姐比我自律100倍！（0）");
                    int choice2 = scanner.nextInt();
                    if (choice2 == 1) {
                        System.out.println("我请你吧！");
                        second();
                        System.out.println();
                        String message8 = "怎么能让绳匠破费……";
                        spt(message8);
                        System.out.println();
                        String message9 = "柳说过，随便让朋友请客是不礼貌的。";
                        spt(message9);
                        System.out.println();
                        second();
                        System.out.println("雅把我当朋友？（1）；没事，我在水吧经常请别人的。（0）");
                        int choice3 = scanner.nextInt();
                        if (choice3 == 1) {
                            System.out.println("雅把我当朋友？");
                            second();
                            System.out.println();
                            String message10 = "哎，不是朋友吗……";
                            spt(message10);
                            System.out.println();
                            second();
                            System.out.println("应该还要再加一个字吧，女……（1）");
                            int choice4 = scanner.nextInt();
                            if (choice4 == 1) {
                                System.out.println("应该还要再加一个字吧，女……");
                                second();
                                System.out.println();
                                System.out.println("×雅好像忽然明白了什么，不自然地转过头去。");
                                second();
                                String message11 = "嗯。我答应了。女朋友。";
                                spt(message11);
                                System.out.println();
                                System.out.println("好感度+1");//好感度+1
                                dot++;
                            }
                            //热望角登出口7


                        } else {
                            System.out.println("没事，我在水吧经常请别人的。");
                            second();
                            System.out.println();

                            String message10 = "别人？你和别人经常来水吧吗。";
                            spt(message10);
                            System.out.println();
                            second();
                            System.out.println("哎，只是偶然碰到的路人啦……（1）；有时候会和朋友来（0）");
                            int choice4 = scanner.nextInt();
                            if (choice4 == 1) {
                                System.out.println("哎，只是偶然碰到的路人啦……");
                                second();
                                System.out.println();
                                System.out.println("×狐希人少女动了一下耳朵，红宝石一样的眼眸认真地盯着你。");
                                System.out.println();
                                second();
                                String message11 = "和多少人来过水吧呢";
                                spt(message11);
                                System.out.println();
                                second();
                                System.out.println("没有！只有雅一个！（1）");
                                int choice5 = scanner.nextInt();
                                if (choice5 == 1) {
                                    System.out.println("没有！只有雅一个！");
                                    second();
                                    System.out.println("×她看了你一会，似乎在很认真地辨别你有没有说谎。");
                                    second();
                                    System.out.println();
                                    System.out.println("×随后，少女的嘴角浮起一抹难得的微笑。");
                                    second();
                                    System.out.println();
                                    String message12 = "嗯，我知道了。";
                                    spt(message12);
                                    System.out.println();
                                    String message13 = "在你心里，我很特别。";
                                    spt(message13);
                                    System.out.println();
                                    System.out.println("好感度+1");//好感度+1
                                    dot++;
                                    //热望角登出口8

                                }
                            } else {
                                System.out.println("有时候会和朋友来");
                                second();
                                System.out.println();
                                String message11 = "这样吗……";
                                spt(message11);
                                System.out.println();
                                second();
                                System.out.println("×狐希人少女动了一下耳朵，红宝石一样的眼眸认真地盯着你。");
                                second();
                                System.out.println();
                                String message12 = "上次看见的鲨鱼希人，还有那个白祇重工的工程师";
                                spt(message12);
                                System.out.println();
                                String message13 = "都是你的【朋友】吗？";
                                spt(message13);
                                System.out.println();
                                second();
                                System.out.println("朋友有很多，恋人可只有一个哦（1）；额……是（0）");
                                int choice5 = scanner.nextInt();
                                if (choice5 == 1) {
                                    System.out.println("朋友有很多，恋人可只有一个哦");
                                    second();
                                    System.out.println();

                                    System.out.println("×她看了你一会，似乎在很认真地辨别你有没有说谎。");
                                    second();
                                    System.out.println();
                                    System.out.println("随后，少女的嘴角浮起一抹难得的微笑。");
                                    second();
                                    System.out.println();

                                    System.out.println("摸摸雅的脸颊（1）");
                                    int choice6 = scanner.nextInt();
                                    if (choice6 == 1) {
                                        System.out.println("×你摸了摸雅的脸颊。");
                                        second();
                                        System.out.println();
                                        String message14 = "好，我答应了。我的恋人。";
                                        spt(message14);

                                        System.out.println();
                                        System.out.println("好感度+1");//好感度+1
                                        dot++;
                                        //热望角登出口9
                                    }

                                } else {
                                    System.out.println("额……是");
                                    second();
                                    System.out.println();
                                    String message14 = "真的……？";
                                    spt(message14);
                                    System.out.println();
                                    String message15 = "唔，没什么。你有你的自由。";
                                    spt(message15);
                                    System.out.println();
                                    second();
                                    System.out.println("×狐希人少女垂下了头，似乎有些失望。");
                                    second();
                                    System.out.println();
                                    System.out.println("怎么了吗？（1）");
                                    int choice6 = scanner.nextInt();
                                    if (choice6 == 1) {
                                        System.out.println("怎么了吗？");
                                        second();
                                        System.out.println();
                                        String message16 = "没事的，不用担心我。";
                                        spt(message16);
                                        System.out.println();
                                        String message17 = "看见你跟别人一起，心里莫名有些失落。";
                                        spt(message17);
                                        System.out.println();
                                        String message18 = "可能是缺少修行吧。";
                                        spt(message18);
                                        System.out.println();
                                        System.out.println("好感度-1");//好感度-1
                                        dot--;
                                        //热望角登出口10

                                    }


                                }

                            }
                        }

                    } else {
                        System.out.println("不不，雅小姐比我自律100倍！");
                        second();
                        System.out.println("×雅轻笑，似乎觉得你很可爱");
                        second();
                        System.out.println("×她突然弯下腰，鲜红色的眸子与你直直对视。");
                        second();
                        System.out.println("×一瞬间你愣了神，水吧里喧闹的空气似乎随着心跳一起停滞");
                        second();
                        System.out.println("×你看见她上翘的睫毛，和肩膀垂下的发梢一个颜色。");
                        second();
                        System.out.println("×你在那片红色湖泊里看见了自己惊慌失措的表情。");
                        second();
                        String message10 = "作为虚狩，是该很自律的。";
                        spt(message10);
                        System.out.println();
                        String message11 = "直到遇见你为止。";
                        spt(message11);
                        System.out.println();
                        String message12 = "到底有什么科技呢，绳匠小姐。";
                        spt(message12);
                        System.out.println();
                        String message13 = "能让新艾利都最年轻的虚狩整夜整夜地梦见你。";
                        spt(message13);
                        System.out.println();
                        System.out.println("好感度+1");//好感度+1
                        dot++;
                        //热望角登出口11

                    }

                }


            } else {
                String message3 = "看起来，你很喜欢光映广场呢。";
                spt(message3);
                System.out.println();
                String message4 = "那里风景很美，回忆也是。";
                spt(message4);
                System.out.println();
                second();

                System.out.println("×和星见雅一起坐地铁来到了光映广场。");
                second();
                System.out.println();
                //转场
                String message5 = "。。。。。";
                for (char c : message5.toCharArray()) {
                    System.out.print(c);
                    try {
                        Thread.sleep(1000); // 暂停1秒
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println();
                String message6 = name + "接下来去哪里呢？";
                spt(message6);
                System.out.println();
                second();
                System.out.println("天桥（1）；『朝露』（2）；江边步道（3）");
                int choice2 = scanner.nextInt();
                if (choice2 == 1) {
                    System.out.println("我们去天桥上看看吧。");
                    second();
                    System.out.println();
                    String message7 = "嗯，我跟着你走。";
                    spt(message7);
                    System.out.println();
                    second();
                    System.out.println("×和星见雅一起走上了天桥");
                    second();
                    System.out.println();
                    System.out.println("×黄昏下，你们看到整个广场浸润着金色的微光。");
                    second();
                    System.out.println("×形形色色的人，或忙碌，或悠闲，");
                    second();
                    System.out.println("×像银河系中的行星，运转在自己的轨道");
                    second();
                    System.out.println("×流淌成新艾利都璀璨的星河。");
                    second();
                    String message8 = "绳匠，在看什么？";
                    spt(message8);
                    System.out.println();
                    second();
                    System.out.println("没什么（1）；在看你（2）");
                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        System.out.println("没什么");
                        second();
                        System.out.println();
                        String message9 = "是吗……";
                        spt(message9);
                        System.out.println();
                        String message10 = "我很喜欢黄昏的时候到这里来。";
                        spt(message10);
                        System.out.println();
                        String message11 = "能提醒我明天要做的事。";
                        spt(message11);
                        System.out.println();
                        second();
                        System.out.println("要做的事？（1）");
                        int choice4 = scanner.nextInt();
                        if (choice4 == 1) {
                            System.out.println("要做的事？");
                            second();
                            System.out.println();
                            String message12 = "嗯，斩杀邪恶，努力变强。";
                            spt(message12);
                            System.out.println();
                            String message13 = "来守护我看到的风景和人。";
                            spt(message13);
                            System.out.println();
                            String message14 = "你也在其中。";
                            spt(message14);
                            System.out.println();
                            second();
                            System.out.println("好感度+1");//好感度+1
                            dot++;
                            //光映广场登出口1
                        }
                    } else {
                        System.out.println("在看你");
                        second();
                        System.out.println();
                        String message9 = "看我……？";
                        spt(message9);
                        System.out.println();
                        second();
                        System.out.println("摸摸雅的耳朵（1）");
                        int choice4 = scanner.nextInt();
                        if (choice4 == 1) {
                            System.out.println("×你摸了摸雅的耳朵。");
                            second();
                            System.out.println("×毛绒绒的耳朵抖了一下，随之而来的是少女脸上泛起的红晕。");
                            second();
                            String message15 = "狐希人的耳朵不能随便乱摸。";
                            spt(message15);
                            System.out.println();
                            String message16 = "但你的话……";
                            spt(message16);
                            System.out.println();
                            String message17 = "再多摸一点，也没有关系的。";
                            spt(message17);
                            System.out.println();
                            System.out.println("好感度+1");//好感度+1
                            dot++;
                            //光映广场登出口2


                        }
                    }


                } else if (choice2 == 2) {
                    String message10 = "朝露……我昨晚才刚去过。";
                    spt(message10);
                    System.out.println();
                    second();
                    System.out.println("哎？那要不换个地方？（1）");
                    int choice5 = scanner.nextInt();
                    if (choice5 == 1) {
                        System.out.println("哎？那要不换个地方？");
                        second();
                        System.out.println();
                        String message11 = "无妨。和你一起去，和一个人去是不一样的。";
                        spt(message11);

                        System.out.println();
                        second();
                        System.out.println("×和星见雅一起去了『朝露』。");
                        second();
                        System.out.println();
                        System.out.println("×“两位小姐是要买花么?“铃兰站在门口，正浅笑着与你们打招呼。");
                        second();
                        System.out.println();
                        String message12 = "嗯，有什么推荐吗？";
                        spt(message12);
                        System.out.println();
                        second();
                        System.out.println("×雅很认真地应了一句，低头抚弄着花材，似乎在进行某个重要的工作。");
                        second();
                        System.out.println("×修建得圆润的指甲轻轻拂过花瓣上的露水，指尖泛起湿润的粉红。");
                        second();
                        System.out.println("×你不禁想，这样的手指，若是做那种事情……");
                        second();
                        System.out.println("……（1）");
                        int choice6 = scanner.nextInt();
                        if (choice6 == 1) {
                            String message14 = "嗯？在想什么，绳匠？";
                            spt(message14);
                            System.out.println();
                            second();
                            System.out.println("没什么（1）");
                            int choice7 = scanner.nextInt();
                            if (choice7 == 1) {
                                System.out.println("没什么");
                                second();
                                System.out.println();
                                String message15 = "你的脸好像很红呢……";
                                spt(message15);

                                System.out.println();
                                String message13 = "老板，要这束深蓝色的玫瑰，帮我包起来吧。";
                                spt(message13);
                                System.out.println();
                                second();
                                System.out.println("×“克莱因色的玫瑰……是送给心爱的人吗”铃兰心知肚明地看了看面前两人。");
                                second();
                                System.out.println("雅有心爱的人？（1）");
                                int choice8 = scanner.nextInt();
                                if (choice8 == 1) {
                                    System.out.println("雅有……");
                                    second();
                                    System.out.println();
                                    System.out.println("×话还未说完，星见雅忽然转过身，将包好的玫瑰送到你怀里。");
                                    second();
                                    System.out.println();
                                    String message16 = "送给你。昨晚来的时候，就觉得这颜色与你的头发很相配。";
                                    spt(message16);
                                    System.out.println();
                                    second();
                                    System.out.println("昨晚来，是为了给我买花吗？（1）；这束玫瑰没什么特殊含义吗？（2）");
                                    int choice9 = scanner.nextInt();
                                    if (choice9 == 1) {
                                        System.out.println("昨晚来，是为了给我买花吗？");
                                        second();
                                        System.out.println();
                                        String message17 = "……被你发现了。";
                                        spt(message17);
                                        System.out.println();
                                        String message18 = "绳匠的洞察力果然不一般。";
                                        spt(message18);
                                        System.out.println();
                                        String message19 = "看来以后想给你惊喜，变得更加困难了呢。";
                                        spt(message19);
                                        System.out.println();
                                        System.out.println("好感度+1");//好感度+1
                                        dot++;
                                        //光映广场登出口4
                                    } else {
                                        System.out.println("这束玫瑰没什么特殊含义吗？");
                                        second();
                                        System.out.println();
                                        String message20 = "……买的时候没想那么多。";
                                        spt(message20);
                                        System.out.println();
                                        String message21 = "但是你如果想有……也不是不行。";
                                        spt(message21);
                                        System.out.println();
                                        System.out.println("好感度+1");//好感度+1
                                        dot++;
                                        //光映广场登出口5
                                    }


                                }
                            }

                        }
                    }


                } else if (choice2 == 3) {
                    String message18 = "江边步道，很适合散步的地方。";
                    spt(message18);
                    System.out.println();
                    String message19 = "一起去吧。";
                    spt(message19);
                    System.out.println();
                    second();
                    System.out.println("×与星见雅一起来到了江边步道。");
                    second();
                    System.out.println();
                    System.out.println("我们去小公园看看吧（1）；沿着江边走走吧（2）");
                    int choice3 = scanner.nextInt();
                    if (choice3 == 1) {
                        System.out.println("我们去小公园看看吧");
                        second();
                        System.out.println();
                        String message20 = "这里有个小公园，以前都没怎么注意";
                        spt(message20);
                        System.out.println();
                        String message21 = "这么偏僻的地方，你怎么这么熟悉？";
                        spt(message21);

                        System.out.println();
                        second();
                        System.out.println("以前跟可琳来过这里野餐。（1）");
                        int choice4 = scanner.nextInt();
                        if (choice4 == 1) {
                            System.out.println("以前跟可琳来过这里野餐。");
                            second();
                            System.out.println();
                            String message22 = "可琳……是那个维多利亚家政的小女仆吗？你还跟她挺亲密的。";
                            spt(message22);
                            System.out.println();
                            second();
                            String message23 = "嗯……";
                            spt(message23);
                            System.out.println();
                            second();
                            System.out.println("怎么不说话了雅？不会生气了吧？（1）");
                            int choice6 = scanner.nextInt();
                            if (choice6 == 1) {
                                System.out.println("怎么不说话了雅？不会生气了吧？");
                                second();
                                System.out.println();
                                String message24 = "生气？我生什么气。";
                                spt(message24);
                                System.out.println();
                                String message25 = "我是在想，那个小女孩缺少自信";
                                spt(message25);
                                System.out.println();
                                String message26 = "能主动跟你出来玩，挺难得的。";
                                spt(message26);
                                System.out.println();
                                String message27 = "拜托你以后也多多照顾她。";
                                spt(message27);
                                second();
                                System.out.println();
                                System.out.println("诶？（1）");
                                int choice7 = scanner.nextInt();
                                if (choice7 == 1) {
                                    System.out.println("诶？");
                                    second();
                                    System.out.println();
                                    String message28 = "怎么了，以为我会因为这种事吃醋吗？";
                                    spt(message28);
                                    System.out.println();
                                    String message29 = "你想多了。";
                                    spt(message29);
                                    System.out.println();
                                    String message30 = "帮助新艾利都市民是绳匠的责任，也是我的责任。";
                                    spt(message30);
                                    System.out.println();
                                    second();
                                    System.out.println("……（1）");
                                    int choice8 = scanner.nextInt();
                                    if (choice8 == 1) {
                                        System.out.println("……");
                                        second();
                                        System.out.println();
                                        String message31 = "上次在你家看录像带，你喝醉了。";
                                        spt(message31);
                                        System.out.println();
                                        String message32 = "你说你爱我。";
                                        spt(message32);
                                        System.out.println();
                                        second();
                                        System.out.println("×星见雅忽然弯腰凑近，温热的气息吐在你的脸颊，掀起一股热浪。");
                                        second();
                                        System.out.println();
                                        String message33 = "我也是。";
                                        spt(message33);
                                        System.out.println();
                                        String message34 = "但我想……相比于爱对方";
                                        spt(message34);
                                        System.out.println();
                                        String message35 = "我们都要同样爱这个世界。";
                                        spt(message35);
                                        System.out.println();
                                        second();
                                        System.out.println("好感度+1");//好感度+1
                                        dot++;
                                        //光映广场登出口6
                                    }
                                }


                            }

                        }


                    } else {
                        System.out.println("沿着江边走走吧。");
                        second();
                        System.out.println();
                        String message30 = "嗯，这个时候的风景最美。";
                        spt(message30);
                        System.out.println();
                        second();
                        System.out.println("×你与星见雅慢慢走在江边。虚狩一贯敏捷的步伐，此刻因为与你一起而放缓。");
                        second();
                        System.out.println("×微风从江面吹来，拂动了雅的长发。");
                        second();
                        System.out.println("×青黑色的发丝飘过笔尖，隐约闻到一股香甜的蜜瓜香气。");
                        second();
                        System.out.println("雅真的很喜欢蜜瓜呢！（1）");
                        int choice6 = scanner.nextInt();
                        if (choice6 == 1) {
                            System.out.println("雅真的很喜欢蜜瓜呢！");
                            second();
                            System.out.println();
                            String message31 = "嗯，蜜瓜很甜，口感软而韧。";
                            spt(message31);
                            System.out.println();
                            String message32 = "最重要的是，修行或者出任务休息的间隙，蜜瓜是很好的补品。";
                            spt(message32);
                            System.out.println();
                            second();
                            System.out.println("没想到雅对蜜瓜有这么高深的见解……（1）");
                            int choice7 = scanner.nextInt();
                            if (choice7 == 1) {
                                System.out.println("没想到雅对蜜瓜有这么高深的见解……");
                                second();
                                System.out.println();
                                String message33 = "蜜瓜真的是一种让人安心的事物。";
                                spt(message33);
                                System.out.println();
                                String message34 = "和你一样。";
                                spt(message34);
                                System.out.println();
                                String message35 = "绳匠……你说我们以后";
                                spt(message35);
                                System.out.println();
                                String message36 = "这样两个人散步的机会，会有多少个呢。";
                                spt(message36);
                                System.out.println();
                                second();
                                System.out.println("好感度+1");//好感度+1
                                dot++;
                                //光映广场登出口6

                            }


                        }

                    }
                }
            }
            second();
            String message10 = "还要去别的地方逛逛吗，" + name + "？";
            spt(message10);
            System.out.println();
            second();
            System.out.println("（1）厄匹斯港（2）六分街拉面馆（3）六分街咖啡厅（4）还是不了");
            int choice8 = scanner.nextInt();
            if (choice8 == 1) {
                System.out.println("去厄匹斯港吧。");
                second();
                System.out.println();
                String message11 = "走吧，去吹吹海风。";
                spt(message11);
                System.out.println();
                second();
                System.out.println("×与星见雅来到了厄匹斯港。");
                second();
                String message12 = "。。。。。";//转场
                for (char c : message12.toCharArray()) {
                    System.out.print(c);
                    try {
                        Thread.sleep(1000); // 暂停1秒
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println();
                String message13 = "我们到哪里去呢，" + name + "？";
                spt(message13);
                System.out.println();
                second();
                System.out.println("灯塔上（1）；去钓鱼（2）");
                int choice9 = scanner.nextInt();
                if (choice9 == 1) {
                    System.out.println("去灯塔上看看吧。");
                    second();
                    System.out.println();
                    System.out.println("×你与星见雅来到了灯塔顶端。");
                    second();
                    System.out.println("×远处空洞的影子正闪烁着，玫红色的光亮昭示着危险。");
                    second();
                    System.out.println("×而近处，晚归的渔船踏着斜阳，在渔夫的欢声中卸下一天的收获。");
                    second();
                    System.out.println();
                    String message14 = "……" + name + "？";
                    spt(message14);
                    System.out.println();
                    second();
                    System.out.println("怎么了？（1）");
                    int choice10 = scanner.nextInt();
                    if (choice10 == 1) {
                        System.out.println("怎么了？");
                        second();
                        System.out.println();
                        String message15 = "你忙碌『丽都有布』赛事的那段时间，曾经跟我说过这样一句话。";
                        spt(message15);
                        System.out.println();
                        String message16 = "新艾利都是欢乐之都。明明是绝望的情境，人们却总有没来由的快乐。";
                        spt(message16);
                        System.out.println();
                        String message17 = "是不是就像这些渔夫一样？";
                        spt(message17);
                        System.out.println();
                        second();
                        System.out.println("×星见雅沉默了几秒，接着自顾自地说起来。");
                        second();
                        System.out.println();
                        String message18 = "当时你说，正是人们对于生活的希望，让我们有力量去与空洞抗衡。";
                        spt(message18);
                        System.out.println();
                        String message19 = "你知道吗，" + name + "，母亲去世后，我一度失去了希望。";
                        spt(message19);
                        System.out.println();
                        String message20 = "直到遇见你。";
                        spt(message20);
                        System.out.println();
                        second();
                        System.out.println("×雅垂下了睫毛，橙红色的霞光在她的脸上打下阴影。");
                        second();
                        System.out.println("×红色的眼眸中，似乎有点点星光，克制地闪动。");
                        second();
                        System.out.println("×你知道，这不是能轻易提起的事情。");
                        second();
                        System.out.println("雅……（1）");
                        int choice11 = scanner.nextInt();
                        if (choice11 == 1) {
                            System.out.println("雅……");
                            second();
                            System.out.println();
                            String message21 = "唔……";
                            spt(message21);
                            System.out.println();
                            second();
                            System.out.println("×星见雅没有说话，眼睛里的星辰摇摇欲坠。");
                            second();
                            System.out.println("×抱抱雅（1）");
                            int choice12 = scanner.nextInt();
                            if (choice12 == 1) {
                                System.out.println("×你张开双臂，轻轻拥抱住面前的少女。");
                                second();
                                System.out.println();
                                System.out.println("×她在你怀里颤抖了一下，随后脱力般靠在你的肩上。");
                                second();
                                System.out.println("×”没事的，没事的，有我在呢。“你轻声对她说。");
                                second();
                                System.out.println();
                                String message22 = "绳匠，抱紧我……";
                                spt(message22);
                                System.out.println();
                                second();
                                System.out.println("×少女终是忍不住眼泪，将头埋进你的颈窝，嚎啕大哭起来。");
                                second();

                                System.out.println("雅，我会是你的家人（1）");
                                int choice13 = scanner.nextInt();
                                if (choice13 == 1) {
                                    System.out.println("雅，今后，我会是你的家人。");
                                    second();
                                    System.out.println();

                                    System.out.println("×你轻拍着她的背，如此认真地说道。");
                                    second();
                                    System.out.println("×雅在你怀里低声抽泣了一会，半晌，抬起头来与你对视。");
                                    second();
                                    System.out.println("×你看见少女漂亮的脸上满是泪痕。瞳孔像一只破碎的碗，盛满了溢出的悲伤。");
                                    second();
                                    String message23 = "虚狩，是不是不适合哭泣……";
                                    spt(message23);
                                    System.out.println();
                                    second();
                                    System.out.println("摸摸雅的头（1）");
                                    int choice14 = scanner.nextInt();
                                    if (choice14 == 1) {
                                        System.out.println("×你轻轻抚摸了一下星见雅的头。");
                                        second();
                                        System.out.println("×”没关系的哦，小雅“");
                                        second();
                                        System.out.println("×“就算你是全新艾利都的虚狩……”");
                                        second();
                                        System.out.println("×“在我面前，也可以只当星见雅。”");
                                        second();
                                        System.out.println();
                                        System.out.println("好感度+3");//好感度+1
                                        dot+=3;
                                        //厄匹斯港登出口1

                                    }


                                }
                            }
                        }
                    }
                } else {
                    System.out.println("我们去钓鱼吧。");
                    second();
                    System.out.println();
                    String message22 = name + "喜欢钓鱼吗，知道了。";
                    spt(message22);
                    System.out.println();
                    second();
                    System.out.println("×你们来到了港口边的小木桥上。");
                    second();
                    System.out.println("×几位老人正坐在桥边悠闲地钓鱼。");
                    second();
                    System.out.println();
                    String message24 = "快来，这里有个很好的位置。";
                    spt(message24);
                    System.out.println();
                    second();
                    System.out.println("雅也喜欢钓鱼吗？（1）");
                    int choice15 = scanner.nextInt();
                    if (choice15 == 1) {
                        System.out.println("雅也喜欢钓鱼吗？");
                        second();
                        String message25 = "嗯，钓鱼是一场锻炼耐心的修行。";
                        spt(message25);
                        System.out.println();
                        String message26 = "自己来钓鱼的时候，经常要在这里坐上几个小时。";
                        spt(message26);
                        System.out.println();
                        second();
                        System.out.println("×星见雅沉默了一下，随后把头靠在了你的肩上。");
                        second();
                        String message27 = name + "，我好像有点累了，可以靠在你肩上吗？";
                        spt(message27);
                        System.out.println();
                        second();
                        System.out.println("当然可以。（1）");
                        int choice16 = scanner.nextInt();
                        if (choice16 == 1) {
                            System.out.println("当然可以，我的肩膀就是给雅靠的哦。");
                            second();
                            System.out.println();
                            System.out.println("×雅静静地靠在你肩上。水光潋滟，金色的夕阳缓缓坠入地平线。");
                            second();
                            System.out.println("×你感受着少女毛茸茸的狐狸耳朵擦过你的耳垂，时间仿佛在这一刻定格。");
                            second();
                            System.out.println("……（1）");
                            int choice17 = scanner.nextInt();
                            if (choice17 == 1) {
                                System.out.println("……");
                                second();
                                System.out.println();
                                String message28 = name + "你的钩子好像动了。";
                                spt(message28);
                                System.out.println();
                                second();
                                System.out.println("×你用力，试图把鱼钩拉上来。");
                                second();
                                System.out.println("好重……！（1）");
                                int choice18 = scanner.nextInt();
                                if (choice18 == 1) {
                                    System.out.println("好重……！");
                                    second();
                                    System.out.println();
                                    String message29 = "我来帮你吧。";
                                    spt(message29);
                                    System.out.println();
                                    second();
                                    System.out.println("×星见雅握住你的手，你低头看见了她小臂上隐隐透出的肌肉。");
                                    second();
                                    System.out.println("×哗的一声，一条半人高的大鱼被甩在了桥上。");
                                    second();
                                    System.out.println("哇，好大一条！（1）；雅的力气好大！（2）");
                                    int choice19 = scanner.nextInt();
                                    if (choice19 == 1) {
                                        System.out.println("哇，好大一条！");
                                        second();
                                        System.out.println();
                                        String message30 = name + "，你好厉害。";
                                        spt(message30);
                                        System.out.println();
                                        String message31 = "我从没钓过这么大的鱼。";
                                        spt(message31);
                                        System.out.println();
                                        second();
                                        System.out.println("那是当然（1）");
                                        int choice20 = scanner.nextInt();
                                        if (choice20 == 1) {
                                            System.out.println("那是当然");
                                            second();
                                            System.out.println();
                                            System.out.println("这片海港，就没有我钓不上来的生物！");
                                            second();
                                            System.out.println("×星见雅忽然抬手摸了摸你的唇。");
                                            second();
                                            System.out.println();
                                            String message32 = "什么都能钓……";
                                            spt(message32);
                                            System.out.println();
                                            String message33 = "包括我吗。";
                                            spt(message33);
                                            System.out.println();
                                            second();
                                            System.out.println("好感度+1");//好感度+1
                                            dot++;
                                            //厄匹斯港登出口2
                                        }
                                    } else if (choice19 == 2) {
                                        System.out.println("雅的力气好大！");
                                        second();
                                        System.out.println();
                                        System.out.println("手臂上的肌肉好漂亮……");
                                        second();
                                        System.out.println();
                                        System.out.println("×星见雅不自然地扭过头，头顶的耳朵动了一下。");
                                        second();
                                        System.out.println("雅这是……（1）");
                                        int choice21 = scanner.nextInt();
                                        if (choice21 == 1) {
                                            System.out.println("雅这是……");
                                            second();
                                            System.out.println();
                                            System.out.println("害羞了？");
                                            second();
                                            System.out.println("耳朵动了诶……好可爱！");
                                            second();
                                            System.out.println();
                                            String message34 = "唔……能得到你的夸赞，很荣幸。";
                                            spt(message34);
                                            System.out.println();
                                            String message35 = "锻炼是每日的必修课。";
                                            spt(message35);
                                            System.out.println();
                                            second();
                                            System.out.println("诶，那刚才……（1）");
                                            int choice22 = scanner.nextInt();
                                            if (choice22 == 1) {
                                                System.out.println("诶，那刚才……");
                                                second();
                                                System.out.println();
                                                System.out.println("雅坐了十分钟就累了……");
                                                second();
                                                System.out.println("是骗我的对吧？");
                                                second();
                                                System.out.println();
                                                String message36 = "才没有……";
                                                spt(message36);
                                                System.out.println();
                                                second();
                                                String message37 = "唔，好吧……";
                                                spt(message37);
                                                System.out.println();
                                                String message38 = "确实是。";
                                                spt(message38);
                                                System.out.println();
                                                String message39 = "不知为何，一见到你……";
                                                spt(message39);
                                                System.out.println();
                                                String message40 = "总是有再靠近一点的冲动。";
                                                spt(message40);
                                                System.out.println();
                                                second();
                                                System.out.println("好感度+1");//好感度+1
                                                dot++;
                                                //厄匹斯港登出口3
                                            }


                                        }

                                    }
                                }
                            }


                        }
                    }
                }
            } else if (choice8 == 2) {
                System.out.println("去六分街吃拉面吧！");
                second();
                System.out.println();
                String message26 = "行啊，正好有点饿了。";
                spt(message26);
                System.out.println();
                String message27 = "乔普师傅做的拉面总是让人胃口大开。";
                spt(message27);
                System.out.println();
                second();
                System.out.println("×与星见雅来到了六分街拉面馆。");
                second();
                System.out.println();
                String message25 = "。。。。。";//转场
                for (char c : message25.toCharArray()) {
                    System.out.print(c);
                    try {
                        Thread.sleep(1000); // 暂停1秒
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println();
                System.out.println("×“要吃什么？师傅给你们做！”乔普师傅远远地看见你们，伸出机械臂招呼道。");
                second();
                System.out.println("师傅！来一碗 超辣牛肉面（1）；清汤鸡蛋面（2）；海鲜甜汤面（3）");
                int choice10 = scanner.nextInt();
                if (choice10 == 1) {
                    System.out.println("师傅！来一碗 超辣牛肉面");
                    second();
                    System.out.println();
                    System.out.println("×你和雅坐在店里等了一会。牛肉面很快端了上来。");
                    second();
                    System.out.println("×面汤上飘着红油，一股小米辣夹杂花椒的香气扑面而来。");
                    second();
                    System.out.println();
                    String message28 = "呼……有一个很不幸的消息。";
                    spt(message28);
                    System.out.println();
                    String message29 = "本来想进行一场『吃完一碗超辣牛肉面』的修行。";
                    spt(message29);
                    System.out.println();
                    String message30 = "但是现在看来，好像失败了。";
                    spt(message30);
                    System.out.println();
                    second();
                    System.out.println();
                    String message31 = name + "，我可以喝一口你的可乐吗？";
                    spt(message31);
                    System.out.println();
                    System.out.println("诶……好（1）");
                    int choice11 = scanner.nextInt();
                    if (choice11 == 1) {
                        System.out.println("诶……好");
                        second();
                        System.out.println();
                        System.out.println("不过只有一根吸管……");
                        second();
                        System.out.println("×雅已经将可乐吸到了嘴里。听见你的话，她转过头来看着你。");
                        second();
                        System.out.println();
                        String message32 = "那我们这算不算……";
                        spt(message32);
                        System.out.println();
                        second();
                        System.out.println("间接接吻？（1）");
                        int choice12 = scanner.nextInt();
                        if (choice12 == 1) {
                            System.out.println("间接接吻？");
                            second();
                            System.out.println();
                            String message33 = "这样吗……不过话说，";
                            spt(message33);
                            System.out.println();
                            String message34 = "好像也不一定非要间接。";
                            spt(message34);
                            System.out.println();
                            second();
                            System.out.println("好感度+1");//好感度+1
                            dot++;
                            //拉面馆登出口1
                        }
                    }


                } else if (choice10 == 2) {
                    System.out.println("师傅！来一碗清汤鸡蛋面");
                    second();
                    System.out.println();
                    System.out.println("×你和雅坐在店里等了一会。清汤鸡蛋面很快端了上来。");
                    second();
                    System.out.println();
                    String message35 = "这个溏心蛋煮的很好吃。";
                    spt(message35);
                    System.out.println();
                    second();
                    System.out.println("×雅轻轻夹起一个还没有被咬过的溏心蛋，伸出筷子像是要往你嘴里送。");
                    second();
                    System.out.println("我碗里也有的……（1）");
                    int choice13 = scanner.nextInt();
                    if (choice13 == 1) {
                        System.out.println("我碗里也有的……");
                        second();
                        System.out.println();
                        System.out.println("×不等你拒绝，溏心蛋已经塞进了你嘴里。");
                        second();
                        System.out.println();
                        String message36 = "有一次，六课和狡兔屋合作。";
                        spt(message36);
                        System.out.println();
                        String message37 = "那个机器人，邀请我看一部录像带。";
                        spt(message37);
                        System.out.println();
                        String message38 = "名字好像叫……哦甜心？";
                        spt(message38);
                        System.out.println();
                        second();
                        System.out.println("这这这……雅不要看这种剧啊！！！（1）");
                        int choice14 = scanner.nextInt();
                        if (choice14 == 1) {
                            System.out.println("这这这……雅不要看这种剧啊！！！");
                            second();
                            System.out.println();
                            String message39 = "嗯，剧情确实有点奇怪，是我没见过的。";
                            spt(message39);
                            System.out.println();
                            String message40 = "不过里面的男女主角就是这样喂对方东西吃的。";
                            spt(message40);
                            System.out.println();
                            String message41 = "我猜，应该是很亲密的人才能做的事情。";
                            spt(message41);
                            System.out.println();
                            second();
                            System.out.println("×雅停顿了一下，很认真地看着你，像是在考虑着什么。");
                            second();
                            System.out.println();
                            String message42 = "下次，我们来试一下剧里别的情节吧。";
                            spt(message42);
                            System.out.println();
                            second();
                            System.out.println("好感度+1");//好感度+1
                            dot++;
                            //拉面馆登出口2
                        }
                    }


                } else {
                    System.out.println("师傅！来一碗海鲜甜汤面");
                    second();
                    System.out.println();
                    System.out.println("×你和雅坐在店里等了一会。海鲜甜汤面很快端了上来。");
                    second();
                    System.out.println();
                    String message43 = "话说，" + name + "，你喜欢甜口的面，还是咸口的？";
                    spt(message43);
                    System.out.println();
                    second();
                    System.out.println("甜口（1）；咸口（2）；都喜欢（3）");
                    int choice15 = scanner.nextInt();
                    if (choice15 == 1) {
                        System.out.println("甜口");
                        second();
                        System.out.println();
                        String message44 = "好巧，我也是。";
                        spt(message44);
                        System.out.println();
                        String message45 = "看来我们很有默契呢。";
                        spt(message45);
                        System.out.println();
                        second();
                        System.out.println("好感度+1");//好感度+1
                    } else if (choice15 == 2) {
                        System.out.println("咸口");
                        second();
                        System.out.println();
                        String message46 = "这样吗，我倒是更喜欢甜口的。";
                        spt(message46);
                        System.out.println();
                        String message47 = "甜食很能补充能量。";
                        spt(message47);
                        System.out.println();
                    } else {
                        System.out.println("都喜欢");
                        second();
                        System.out.println();
                        String message48 = "你果然不挑食呢。";
                        spt(message48);
                        System.out.println();
                        String message49 = "真是太好了。";
                        spt(message49);
                        System.out.println();
                        second();
                        System.out.println("……？（1）");
                        int choice16 = scanner.nextInt();
                        if (choice16 == 1) {
                            System.out.println("诶？");
                            second();
                            System.out.println();
                            String message50 = "最近想学习烹饪。";
                            spt(message50);
                            System.out.println();
                            String message51 = "柳说，第一次做出来的菜品，最好还是找个不挑食的人来尝比较好。";
                            spt(message51);
                            System.out.println();
                            String message52 = "当时第一个就想到了你。";
                            spt(message52);
                            System.out.println();
                            String message53 = "下次，尝尝我的手艺吧。";
                            spt(message53);
                            System.out.println();
                            second();
                            System.out.println("好感度+1");//好感度+1
                            dot++;
                            System.out.println();
                        }
                    }
                    second();
                    System.out.println("×雅突然不说话了，将手搭在你的手上，而后转头看向窗外。");
                    second();
                    System.out.println("×夏秋之际，路边的树从枝桠开始染上金黄。");
                    second();
                    System.out.println("雅？（1）");
                    int choice17 = scanner.nextInt();
                    if (choice17 == 1) {
                        System.out.println("雅？");
                        second();
                        System.out.println();
                        String message54 = "要是每一天都这样平静就好了。";
                        spt(message54);
                        System.out.println();
                        String message55 = "今天的面汤似乎格外甜。";
                        spt(message55);
                        System.out.println();
                        String message56 = "是因为海鲜，还是因为一起吃面的人呢。";
                        spt(message56);
                        System.out.println();
                        second();
                        System.out.println("好感度+1");//好感度+1
                        dot++;
                        //拉面馆登出口3


                    }


                }
            } else if (choice8 == 3) {
                System.out.println("去六分街喝咖啡吧！");
                second();
                System.out.println();
                String message57 = "是个好主意。走吧。";
                spt(message57);
                System.out.println();
                second();
                System.out.println("×和雅一起来到了汀曼大师的咖啡馆。");
                second();
                System.out.println();
                String message58 = "。。。。。";//转场
                for (char c : message58.toCharArray()) {
                    System.out.print(c);
                    try {
                        Thread.sleep(1000); // 暂停1秒
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println();
                second();
                String message59 = "喝点什么，" + name + "？";
                spt(message59);
                System.out.println();
                second();
                System.out.println("（1）冰美式（2）拿铁（3）焦糖玛琪朵");
                int choice18 = scanner.nextInt();
                if (choice18 == 1) {
                    System.out.println("冰美式");
                    second();
                    System.out.println();
                    String message60 = "好。老板，要一杯莓果茶，一杯冰美式。";
                    spt(message60);
                    System.out.println();
                    second();
                    System.out.println("×雅皱起眉头，露出了疑惑的神情。");
                    second();
                    System.out.println();
                    String message61 = "话说，你觉不觉得冰美式很苦？";
                    spt(message61);
                    System.out.println();
                    second();
                    System.out.println("咖啡就是要苦才好喝！（1）");
                    int choice19 = scanner.nextInt();
                    if (choice19 == 1) {
                        System.out.println("咖啡就是要苦才好喝！");
                        second();
                        System.out.println();
                        String message62 = "哦，原来如此……";
                        spt(message62);
                        System.out.println();
                        String message63 = "看来是我品味的问题。";
                        spt(message63);
                        System.out.println();
                        String message64 = "每次喝苦咖啡，都要马上吃点什么甜的东西。";
                        spt(message64);
                        System.out.println();
                        String message65 = "你要不要也试试这样做？";
                        spt(message65);
                        System.out.println();
                        String message66 = "我今天涂的唇膏，刚好是甜的。";
                        spt(message66);
                        System.out.println();
                        second();
                        System.out.println("真的可以吗（1）");
                        int choice20 = scanner.nextInt();
                        if (choice20 == 1) {
                            System.out.println("真的可以吗");
                            second();
                            System.out.println();
                            String message67 = "嗯？你的脸为什么这么红。";
                            spt(message67);
                            second();
                            System.out.println();
                            System.out.println("×只见雅从口袋里掏出一只唇膏递给你。");
                            second();
                            System.out.println();
                            String message68 = "只是借个唇膏而已。不用不好意思的。";
                            spt(message68);
                            System.out.println();
                            second();
                            System.out.println("好感度+1");//好感度+1
                            dot++;
                            //咖啡店登出口1
                        }
                    }
                } else if (choice18 == 2) {
                    System.out.println("拿铁");
                    second();
                    System.out.println();
                    String message69 = "好。老板，要一杯拿铁，一杯莓果茶。";
                    spt(message69);
                    System.out.println();
                    second();
                    System.out.println("莓果茶？（1）");
                    int choice21 = scanner.nextInt();
                    if (choice21 == 1) {
                        System.out.println("雅点了一杯莓果茶，是喝不了咖啡吗");
                        second();
                        System.out.println();
                        String message70 = "嗯。因为咖啡可能会影响睡眠。";
                        spt(message70);
                        System.out.println();
                        String message71 = "我习惯早睡早起。";
                        spt(message71);
                        System.out.println();
                        second();
                        System.out.println("哇！好自律（1）");
                        int choice22 = scanner.nextInt();
                        if (choice22 == 1) {
                            System.out.println("哇！好自律");
                            second();
                            System.out.println("我几乎每天都要熬到12点呢……");
                            second();
                            System.out.println("果然身边都是健康人士，没人陪我熬夜……");
                            second();
                            System.out.println("×雅认真思考了一会儿，随后郑重地说：");
                            second();
                            System.out.println();
                            String message72 = "我可以陪你的。";
                            spt(message72);
                            System.out.println();
                            String message73 = "对于执行官来说，为了任务通宵是常有的事。";
                            spt(message73);
                            System.out.println();
                            String message74 = "我体力很好，所以就算一整夜都在做奇怪的事情，也没关系的。";
                            spt(message74);
                            System.out.println();
                            second();
                            System.out.println("！？（1）");
                            int choice23 = scanner.nextInt();
                            if (choice23 == 1) {
                                System.out.println("！？");
                                second();
                                System.out.println();
                                String message75 = "怎么了，你看起来很惊讶的样子。";
                                spt(message75);
                                System.out.println();
                                String message76 = "是因为虚狩的体能震惊吗。";
                                spt(message76);
                                System.out.println();
                                String message77 = "没关系的，下次我们可以一起熬夜看录像带。";
                                spt(message77);
                                System.out.println();
                                second();
                                System.out.println("好感度+1");//好感度+1
                                dot++;
                                //咖啡店登出口2

                            }


                        }
                    }
                } else {
                    System.out.println("焦糖玛琪朵");
                    second();
                    System.out.println();
                    String message78 = "好。老板，要一杯焦糖玛琪朵，一杯莓果茶。";
                    spt(message78);
                    System.out.println();
                    second();
                    System.out.println("×汀曼大师熟练地用喷火枪烤焦糖。随着他的动作，一股甜香味飘散出来。");
                    second();
                    System.out.println();
                    String message79 = "焦糖的香气……好浓郁。";
                    spt(message79);
                    System.out.println();
                    String message80 = "六课的办公室里也有同样的气味呢。";
                    spt(message80);
                    System.out.println();
                    second();
                    System.out.println("六课办公室里也会烤焦糖吗？（1）");
                    int choice24 = scanner.nextInt();
                    if (choice24 == 1) {
                        System.out.println("六课办公室里也会烤焦糖吗？");
                        second();
                        System.out.println();
                        String message81 = "嗯。午休的时候，柳会点焦糖布丁。";
                        spt(message81);
                        System.out.println();
                        String message82 = "经常要点十人份，小苍角一个人吃七份。";
                        spt(message82);
                        System.out.println();
                        second();
                        System.out.println("忽然有点担心对空六课的预算了……（1）");
                        int choice25 = scanner.nextInt();
                        if (choice25 == 1) {
                            System.out.println("忽然有点担心对空六课的预算了");
                            second();
                            System.out.println();
                            String message83 = "确实。柳经常会开玩笑，说我们快要没地方住了。";
                            spt(message83);
                            System.out.println();
                            second();
                            System.out.println("可以住在random play！（1）");
                            int choice26 = scanner.nextInt();
                            if (choice26 == 1) {
                                System.out.println("可以住在random play！");
                                second();
                                System.out.println();
                                String message84 = "诶，是吗……可是我记得你们好像只有两个房间。";
                                spt(message84);
                                System.out.println();
                                String message85 = "如果真要住的话，我睡沙发好了。";
                                spt(message85);
                                System.out.println();
                                second();
                                System.out.println("可以跟我一起住的！（1）");
                                int choice27 = scanner.nextInt();
                                if (choice27 == 1) {
                                    System.out.println("可以跟我一起住的！");
                                    second();
                                    System.out.println();
                                    String message86 = "真的……？你半夜会不会做什么奇怪的事情。";
                                    spt(message86);
                                    System.out.println();
                                    second();
                                    System.out.println("×雅用怀疑的眼神看了你一眼。你莫名觉得这时的雅很可爱。");
                                    second();
                                    System.out.println("那当然（1）");
                                    int choice28 = scanner.nextInt();
                                    if (choice28 == 1) {
                                        System.out.println("那当然");
                                        second();
                                        System.out.println("雅这么可爱……");
                                        second();
                                        System.out.println("叫人很难忍住吧！");
                                        second();
                                        System.out.println();
                                        String message87 = "诶……夸我可爱吗";
                                        spt(message87);
                                        System.out.println();
                                        String message88 = "谢谢你。";
                                        spt(message88);
                                        System.out.println();
                                        second();
                                        System.out.println("×雅低下了头。似乎有些欲言又止。");
                                        second();
                                        System.out.println();
                                        String message89 = "那下次，可不可以真的去你家住？";
                                        spt(message89);
                                        System.out.println();
                                        String message90 = "就算你要做奇怪的事情……也没关系的。";
                                        spt(message90);
                                        System.out.println();
                                        second();
                                        System.out.println("好感度+1");//好感度+1
                                        dot++;
                                        //咖啡店登出口3
                                    }

                                }
                            }
                        }
                    }
                }


            } else {
                System.out.println("还是不了。");
                second();
                System.out.println();
                String message91 = name + "要回家了吗……好吧。";
                spt(message91);
                System.out.println();
                String message92 = "正好父亲也催我回家用膳了。";
                spt(message92);
                System.out.println();
                second();
                System.out.println("×这时，你口袋里的手机震动了一下。");
                second();
                System.out.println("嗯？（1）");
                int choice29 = scanner.nextInt();
                if (choice29 == 1) {
                    System.out.println("嗯？");
                    second();
                    System.out.println();
                    String message93 = "怎么了，" + name;
                    spt(message93);
                    System.out.println();
                    second();
                    System.out.println("×你举起手机给雅看。");
                    second();
                    System.out.println("×只见备注了”哥哥“的对话框里，赫然写着：");
                    second();
                    System.out.println("×“铃，今晚我要去给伊埃斯作检修，晚饭自己在外面解决哦”");
                    second();
                    System.out.println();
                    String message94 = "诶要不……来我家吃饭，怎么样？";
                    spt(message94);
                    System.out.println();
                    second();
                    System.out.println("可以吗？（1）");
                    int choice30 = scanner.nextInt();
                    if (choice30 == 1) {
                        System.out.println("可以吗？");
                        second();
                        System.out.println();
                        String message95 = "当然。随我来吧。";
                        spt(message95);
                        System.out.println();
                        second();
                        System.out.println("×你跟随雅来到了星见家的园林。");
                        second();
                        System.out.println();
                        String message96 = "。。。。。";//转场
                        for (char c : message96.toCharArray()) {
                            System.out.print(c);
                            try {
                                Thread.sleep(1000); // 暂停1秒
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        System.out.println();
                        System.out.println("×古日式的房屋，连檐角都雕刻得精美。");
                        second();
                        System.out.println("×光洁的石板路，走在上面能闻见清冷的气味。");
                        second();
                        System.out.println("×忽然，一个身穿青色道袍的男子走了出来，眉眼与雅有几分相似。");
                        second();
                        System.out.println("这是……？（1）");
                        int choice31 = scanner.nextInt();
                        if (choice31 == 1) {
                            System.out.println("这是……？");
                            second();
                            System.out.println();
                            String message97 = "父亲，我带了一个朋友回来。";
                            spt(message97);
                            System.out.println();
                            second();
                            System.out.println("父亲……啊不是，叔叔好！（1）");
                            int choice32 = scanner.nextInt();
                            if (choice32 == 1) {
                                System.out.println("父亲……啊不是，叔叔好！");
                                second();
                                System.out.println();
                                System.out.println("×“你好你好，想必你就是铃吧？“");
                                second();
                                System.out.println("×男人笑了一下，眼角的细纹隐隐现出。");
                                second();
                                System.out.println("×虽然年纪大了，但仍可从那下颚分明的轮廓中感受到名门的气度。");
                                second();
                                System.out.println("×“我就是小雅她父亲，晚膳已让管家备好了，随我来吧。”");
                                second();
                                System.out.println();
                                String message98 = "我们走吧，" + name + "。";
                                spt(message98);
                                System.out.println();
                                second();
                                System.out.println("×你跟着雅走进了星见家的正厅。");
                                second();
                                System.out.println("×只见檀香木长桌上，琳琅满目都是些你从未见过的山珍海味。");
                                second();
                                System.out.println("我这辈子都没有见过如此丰盛的晚宴……（1）；这么多菜，准备这些的人一定很辛苦吧。（2）");
                                int choice33 = scanner.nextInt();
                                if (choice33 == 1) {
                                    System.out.println("我这辈子都没有见过如此丰盛的晚宴……");
                                    second();
                                    System.out.println("×”快坐下吃，别客气！小雅今天传信给家里说你要来，特意备得丰盛了些。“");
                                    second();
                                    System.out.println("谢谢叔叔（1）");
                                    int choice34 = scanner.nextInt();
                                    if (choice34 == 1) {
                                        System.out.println("谢谢叔叔");
                                        second();
                                        System.out.println("×你小心翼翼坐下，拿起筷子夹了一口理你最近的菜。");
                                        second();
                                        System.out.println("×似是感受到了你的窘迫，雅伸手夹一块肉放在你碗里。");
                                        second();
                                        System.out.println();
                                        String message99 = "不用紧张，" + name + "。这些都是你爱吃的，";
                                        spt(message99);
                                        System.out.println();
                                        String message100 = "以前出去约会时，我特意记下了你爱吃的菜谱。";
                                        spt(message100);
                                        System.out.println();
                                        second();
                                        System.out.println("×”哎哟，这样才对嘛，小雅！“");
                                        second();
                                        System.out.println("×低头吃饭的星见先生突然抬起头来，在你和雅之间扫视一圈。");
                                        second();
                                        System.out.println("×随后露出了一抹意味深长的笑。");
                                        second();
                                        System.out.println("×“铃啊，你是不知道，雅一回家就总念叨你。”");
                                        second();
                                        System.out.println("×”真的要谢谢你平时照顾我们家小雅了。“");
                                        second();
                                        System.out.println("×”她的后半生交给你，我这个做父亲的就放心了。“");
                                        second();
                                        System.out.println("×“晚上要不要留下来过夜？我正好买了几盒……”");
                                        second();
                                        System.out.println("叔叔你误会了（1）");
                                        int choice35 = scanner.nextInt();
                                        if (choice35 == 1) {
                                            System.out.println("叔叔你误会了");
                                            second();
                                            System.out.println("我和雅还没有到那一步……");
                                            second();
                                            System.out.println("×”哎哟我懂我懂……“");
                                            second();
                                            System.out.println("×”年轻人含蓄一点很正常嘛……“");
                                            second();
                                            System.out.println();
                                            String message101 = name + "……";
                                            spt(message101);
                                            System.out.println();
                                            second();
                                            System.out.println("×雅忽然凑近你耳边，用只有你们才能听见的音量轻声说。");
                                            second();
                                            System.out.println();
                                            String message103 = "一直让父亲这样误会也不太好……";
                                            spt(message103);
                                            System.out.println();
                                            String message102 = "我们要不要，找个时间试一下？";
                                            spt(message102);
                                            System.out.println();
                                            second();
                                            System.out.println("好感度+1");//好感度+1
                                            dot++;

                                        }
                                    }
                                } else if (choice33 == 2) {
                                    System.out.println("这么多菜，准备这些的人一定很辛苦吧。");
                                    second();
                                    System.out.println("×雅的父亲本来在倒酒，听见你的话，意外地抬起头来看了看你。");
                                    second();
                                    System.out.println("×随后投来赞许的目光。");
                                    second();
                                    System.out.println("×”小雅说得没错，你果然不一般。“");
                                    second();
                                    System.out.println("×“身处高处，还能细心体谅身边人的辛苦。”");
                                    second();
                                    System.out.println("×“这样值得信赖的人，就算知道我把酒换成果汁的秘密，”");
                                    second();
                                    System.out.println("×“我也不必担心。”");
                                    second();
                                    System.out.println("啊哈哈……（1）");
                                    int choice36 = scanner.nextInt();
                                    if (choice36 == 1) {
                                        System.out.println("啊哈哈……");
                                        second();
                                        System.out.println("话题跳转得好快……");
                                        second();
                                        System.out.println();
                                        String message104 = "看吧，父亲。";
                                        spt(message104);
                                        System.out.println();
                                        String message105 = "我向您说过铃是值得托付终身的人。";
                                        spt(message105);
                                        System.out.println();
                                        second();
                                        System.out.println("×大抵是没想到雅会在家人面前这样直白地肯定自己，你感到有些惊讶。");
                                        second();
                                        System.out.println("×随之而来的是心底泛起的甜蜜。");
                                        second();
                                        System.out.println("×没等你反应过来，雅已经牵住了你的手。");
                                        second();
                                        System.out.println();
                                        String message106 = "我想让身边所有人都认可你。";
                                        spt(message106);
                                        second();
                                        System.out.println();
                                        String message107 = "因为你是我自己选定的家人。";
                                        spt(message107);
                                        second();
                                        System.out.println();
                                        System.out.println("好感度+1");//好感度+1
                                        dot++;


                                    }
                                }
                                second();
                                System.out.println("×临走前，雅和她的父亲将你送到门外。");
                                second();
                                System.out.println("×“以后常来啊！”雅的父亲笑着向你挥手。");
                                second();
                                System.out.println();
                                String message108 = "会的，父亲。";
                                spt(message108);
                                System.out.println();
                                String message109 = "她来我们家的机会，以后还有很多。";
                                spt(message109);
                                System.out.println();
                                second();
                                System.out.println("好感度+1");//好感度+1
                                dot++;


                            }
                        }
                    }
                }

            }
            second();
            System.out.println();
            System.out.println("#系统提示！你与雅的美好一天已经结束啦！");
            second();
            System.out.println("#在今天的约会中，你一共获得了『" + dot + "』点好感度！");
            if (dot >= 3) {
                System.out.println("#好感度达到3点，解锁彩蛋！");
                second();
                System.out.println("请按1解锁彩蛋！");
                int choice37 = scanner.nextInt();
                if (choice37 == 1) {
                    System.out.println("彩蛋已解锁！");
                    second();
                    String message111 = "。。。。。";//转场
                    for (char c : message111.toCharArray()) {
                        System.out.print(c);
                        try {
                            Thread.sleep(1000); // 暂停1秒
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println();
                    second();
                    System.out.println("×某一天下午，你与雅在六分街散步。");
                    second();
                    System.out.println("×雅突然停下来，转过身与你对视。");
                    second();
                    System.out.println("×少女的耳尖通红，似乎有什么难以启齿的事。");
                    second();
                    String message110 = "那个……我们要不要去你家看看？";
                    spt(message110);
                    System.out.println();
                    second();
                    System.out.println("哎……？（1）");
                    int choice38 = scanner.nextInt();
                    if (choice38 == 1) {
                        System.out.println("哎……？");
                        second();
                        System.out.println("雅想要来我家嘛。");
                        second();
                        String message112 = "嗯，可以吗？" + name + "。";
                        spt(message112);
                        System.out.println();
                        second();
                        System.out.println("当然可以！（1）");
                        int choice39 = scanner.nextInt();
                        if (choice39 == 1) {
                            System.out.println("当然可以！");
                            second();
                            System.out.println("Random Play 有虚狩小姐的莅临，简直是荣幸之至！");
                            second();
                            System.out.println("×你与雅一起回到了Random Play 的店内。");
                            second();
                            String message113 = "。。。。。";//转场
                            for (char c : message113.toCharArray()) {
                                System.out.print(c);
                                try {
                                    Thread.sleep(1000); // 暂停1秒
                                } catch (InterruptedException e) {
                                    e.printStackTrace();
                                }
                            }
                            System.out.println();
                            second();
                            System.out.println("×周末的这个时间，录像店已经打烊了。");
                            second();
                            System.out.println("×一排排货架沉默着，只在时钟的滴答声中共享这一刻闲暇。");
                            second();
                            System.out.println("雅想要去我房间看看吗？（1）");
                            int choice40 = scanner.nextInt();
                            if (choice40 == 1) {
                                System.out.println("雅想要去我房间看看吗？");
                                second();
                                System.out.println("×似乎是没有预料到你主动邀请，少女愣了一下。");
                                second();
                                System.out.println("×随后微不可查地点了点头。");
                                second();
                                System.out.println("×你牵着雅的手上了楼，将房门轻轻关上。");
                                second();
                                String message114 = "关门的话，气氛会很奇怪……";
                                spt(message114);
                                System.out.println();
                                second();
                                System.out.println("×夕阳的余晖从窗外斜斜洒落，在床头留下菱形的光斑。");
                                second();
                                System.out.println("×老旧的床头柜上，摆放着一个精心制作的相框。");
                                second();
                                System.out.println("×玻璃反射出的点点光亮引起了雅的注意。");
                                second();
                                String message115 = "这张照片，你一直摆在房间里吗？";
                                spt(message115);
                                System.out.println();
                                second();
                                System.out.println("……（1）");
                                int choice41 = scanner.nextInt();
                                if (choice41 == 1) {
                                    System.out.println("……");
                                    second();
                                    System.out.println("×那是你们第一次约会时的合照。");
                                    second();
                                    System.out.println("×你低头看着少女的指尖细细摩挲过相框，不觉心旌摇荡。");
                                    second();
                                    String message116 = "嗯，怎么这样看着我？";
                                    spt(message116);
                                    System.out.println();
                                    String message117 = "你的眼神，好奇怪……";
                                    spt(message117);
                                    System.out.println();
                                    second();
                                    System.out.println("吻上雅（1）");
                                    int choice42 = scanner.nextInt();
                                    if (choice42 == 1) {
                                        System.out.println("×你轻轻将雅推倒在床上，吻上了雅的嘴唇。");
                                        second();
                                        String message118 = "唔……";
                                        spt(message118);
                                        System.out.println();
                                        String message119 = name + "……喘不过气来了。";
                                        spt(message119);
                                        System.out.println();
                                        second();
                                        System.out.println("×唇瓣软软的，好像在吃一颗甜腻的棉花糖。");
                                        second();
                                        System.out.println("×第一次接吻的你，很快找到了门道。");
                                        second();
                                        System.out.println("×你用舌头撬开了雅的牙齿，将她口中的津液一并卷走。");
                                        second();
                                        System.out.println("×直到掠走所有的空气，你才依依不舍地放开身下的少女。");
                                        second();
                                        String message120 = name + "，我爱你。";
                                        spt(message120);
                                        System.out.println();
                                        String message121 = "请和我永远在一起吧，我认真的。";
                                        spt(message121);
                                        System.out.println();
                                        second();
                                        System.out.println("×你被雅的突然直球弄得措手不及，只觉脸上的热度烧得滚烫。");
                                        second();
                                        System.out.println("×低头再看时，她的嘴角已被亲的通红，和瞳孔一个颜色。");
                                        second();
                                        

                                    }

                                }
                            }
                        }
                    }
                }


            } else {
                System.out.println("#好感度不足，无法解锁彩蛋哦！");
                second();
                System.out.println("#重新试一次吧！");
            }
            second();

            System.out.println("#祝各位绳匠吃得开心～");
            second();
            System.out.println("#再来一次（任意数字键）直接退出（0）");
            int exit= scanner.nextInt();
            if(exit==0){
                System.out.println("#再见啦！生活愉快，绳匠大人～");
                break;
            }
        }
    }

    public static void spt(String a) {
        for (char c : a.toCharArray()) {
            System.out.print(c);
            try {
                Thread.sleep(100); // 暂停0.1秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }

    public static void second() {
        try {
            Thread.sleep(1000); // 停顿一秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String toString() {
        return "星见雅约会系统{}";
    }
}



