export default function AmericanBoots() {
  return (
    <div className="min-h-screen flex flex-col items-center justify-center bg-gradient-to-b from-red-600 via-white to-blue-600 text-black text-center p-8">
      <h1 className="text-5xl font-extrabold mb-4">AMERICAN BOOTS</h1>
      <p className="text-lg font-medium mb-6 max-w-xl">
        Crafted for climbers and dreamers. Built on <span className="text-blue-700 font-bold">honesty</span>, <span className="text-red-600 font-bold">integrity</span>, and <span className="text-blue-700 font-bold">honor</span>.
      </p>
      <img src="/mnt/data/0.jpg" alt="American Boots" className="h-[550px] w-auto rounded-2xl border border-black/20 shadow-2xl mb-6 object-cover" />
      <p className="text-sm text-black/70 max-w-md">
        A simple showcase inspired by crypto charts and American pride. No tokens. No contracts. Just design and grit.
      </p>
      <footer className="mt-10 text-xs text-black/60">
        © {new Date().getFullYear()} American Boots. All Rights Reserved.
      </footer>
    </div>
  );
}
