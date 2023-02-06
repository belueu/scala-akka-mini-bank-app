package io.belueu.app
package bank.actors

import akka.actor.typed.ActorRef
import io.belueu.app.bank.actors.PersistentBankAccount.Command

object Bank {

  // commands = messages

  // events
  sealed trait Event
  case class BankAccountCreated(id: String) extends Event

  // state
  case class State(accounts: Map[String, ActorRef[Command]])
}
