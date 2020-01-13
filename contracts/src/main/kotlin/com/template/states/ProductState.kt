package com.template.states

import com.template.contracts.ProductContract
import net.corda.core.contracts.BelongsToContract
import net.corda.core.contracts.ContractState
import net.corda.core.contracts.UniqueIdentifier
import net.corda.core.identity.AbstractParty
import net.corda.core.identity.Party

// *********
// * State *
// *********

@BelongsToContract(ProductContract::class)
data class ProductState(
        val buyer: Party,
        val bank: Party,
        val manufacturer: Party,
        val vin: String,
        val licensePlateNumber: String,
        val make: String,
        val model: String,
        val dealershipLocation: String,
        val linearId: UniqueIdentifier
) : ContractState {
    override val participants: List<AbstractParty> = listOf(buyer, bank, manufacturer)
}