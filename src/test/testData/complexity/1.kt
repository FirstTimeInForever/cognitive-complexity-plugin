fun testBinaryExpr(b: Boolean) {
    if (a               // +1 for `if`
        && b && c       // +1
        || d || e       // +1
        && f            // +1
    ) {
    }

    if (a               // +1 for `if`
        &&              // +1
        !(b && c)       // +1                   я пока добавила в тесты еще +1 за эту строчку, т.к. тут есть b && c.
                        //                      т.е. +1 за ! и еще +1 за (b && c).
                        //                      Т.к. если бы было просто выражение b && c, то сложность была бы 1.
                        //                      Ну и плюс если было бы подвыражение !(a || b && c), то сложность уже 3.
                        //                      Мне кажется, логично. Надо обсудить.
    ) {
    }
}