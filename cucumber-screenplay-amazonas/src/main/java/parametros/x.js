/**
 * 
 */

import { Target } from 'serenity-js/protractor';


import { PerformsTasks, Task } from 'serenity-js/lib/screenplay';
import { Enter } from 'serenity-js/protractor';

import { protractor } from 'protractor';



export class x implements Task {

    static called(itemName: string) {
        return new x(itemName);
    }

    performAs(actor: PerformsTasks): PromiseLike<void> {
        return actor.attemptsTo(
            Enter.theValue(this.itemName)                   // enter the value of the item name
                .into("#VA_3848TYUUAILVZUF_559727")       // into a "What needs to be done" field
                .thenHit(protractor.Key.ENTER)              // then hit enter...
        );
    }                                                       // see? we didn't even need this explanation!

    constructor(private itemName: string) {
    }
}
