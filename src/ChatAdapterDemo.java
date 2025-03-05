class ChatAdapterDemo {
    public static void main(String[] args) {
        LegacyChatService legacyChat = new LegacyChatService();
        ChatService chatService = new ChatServiceAdapter(legacyChat);
        chatService.sendMessage("Hello Gala!");
    }
}

