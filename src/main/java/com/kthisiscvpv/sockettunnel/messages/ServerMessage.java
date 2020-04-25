package com.kthisiscvpv.sockettunnel.messages;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@Data
public class ServerMessage extends ClientsocketMessage
{
	private String message;
}
