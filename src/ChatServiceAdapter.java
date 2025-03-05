class ChatServiceAdapter implements ChatService {
    private LegacyChatService legacyChat;

    public ChatServiceAdapter(LegacyChatService legacyChat) {
        this.legacyChat = legacyChat;
    }

    public void sendMessage(String message) {
        legacyChat.sendOldMessage(message);
    }
}
