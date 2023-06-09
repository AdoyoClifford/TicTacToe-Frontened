package com.adoyo.tictactoe.data

import kotlinx.coroutines.flow.Flow

interface RealTimeMessaging {
    fun gameStateStream(): Flow<GameState>
    suspend fun sendAction(action: MakeTurn)
    suspend fun close()

}